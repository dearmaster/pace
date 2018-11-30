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