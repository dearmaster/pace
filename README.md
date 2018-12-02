####hot swapping
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <version>${org.springframework.boot.version}</version>
            <optional>true</optional>
        </dependency>
        
         <plugin>
             <groupId>org.springframework.boot</groupId>
             <artifactId>spring-boot-maven-plugin</artifactId>
             <version>${org.springframework.boot.version}</version>
             <configuration>
                 <fork>true</fork>
             </configuration>
         </plugin>
         
        shotcut:
        Ctrl + Shift + F9
        
####How to specify the repository path
        <repository>
            <id>central</id>
            <name>Aliyun Repository</name>
            <layout>default</layout>
            <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
        </repository>
        
####How to change the port for springboot

####How to install Jconn4 jar
mvn install:install-file -Dfile=D:\softwares\SAP\jConnect-16_0\classes\jconn4.jar -Dpackaging=jar -DgroupId=com.sybase -DartifactId=jconn4 -Dversion=16.0

####How to fix warn '010SK: Database cannot set connection option SET_READONLY_FALSE.'
dbcc reindex(spt_mda)
update spt_mda set querytype = 4, query = '0' where mdinfo = 'SET_READONLY_TRUE' -- default is 3, ''
update spt_mda set querytype = 4, query = '0' where mdinfo = 'SET_READONLY_FALSE'

####How to import test data
hibernate.hbm2ddl.import_files=/data-import/syb-import-data.sql
*Attention: This doesn't work when the hibernate.hbm2ddl.auto is set to update