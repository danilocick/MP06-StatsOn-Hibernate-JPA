# Tutorial per configurar i administrar un projecte amb Hibernate i JPA
<hr>

1. Open Intellij

2. Create new project with Maven
   
3. Add dependencies in pom.xml

```
<dependencies>
        <!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core -->
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>5.4.29.Final</version>
        </dependency>
        
        <!--https://mvnrepository.com/artifact/org.postgresql/postgresql/42.2.19.jre7-->
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <version>42.2.19.jre7</version>
        </dependency>
    </dependencies>
```

4. Create the file persistence.xml, and add the next content
```
src/main/resources/META-INF/persistence.xml
```

```
<?xml version="1.0" encoding="UTF-8"?>
<persistence version="2.1" xmlns="http://xmlns.jcp.org/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence
       http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd">
    <persistence-unit name="Databasename" > <!--CHANGE IP AND DATABASE NAME-->
        <properties>
            <property name="javax.persistence.jdbc.url" value="jdbc:postgresql://192.168.0.0:5432/Databasename" /> <!--CHANGE IP AND DATABASE NAME-->
            <property name="javax.persistence.jdbc.user" value="usuario" />  <!--CHANGE user NAME-->
            <property name="javax.persistence.jdbc.password" value="usuario" />  <!--CHANGE passwd NAME-->
            <property name="javax.persistence.jdbc.driver" value="org.postgresql.Driver" />
            <property name="hibernate.show_sql" value="true" />
            <property name="hibernate.format_sql" value="true" />
        </properties>
    </persistence-unit>
</persistence>
```

5. Create orm.xml: Exists two ways to implements the anotate the entities of a columns:

    1. with orm.xml, here you use a mapping resource that you specify your content

    ```
    src/main/resources/META-INF/orm.xml
    ```
    ```
    <?xml version="1.0" encoding="UTF-8"?>
    <entity-mappings version="2.1" xmlns="http://xmlns.jcp.org/xml/ns/persistence/orm" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence/orm http://xmlns.jcp.org/xml/ns/persistence/orm_2_1.xsd">
        <description>The minimal mappings for a persistent entity in XML.</description>
        <entity name="Autor" class="Entities.Autor" access="FIELD">
            <table name="autors"/> <!--table name-->
            <attributes> <!--and atributes-->
                <id name="id_autor"/>
                <basic name="nom">
                    <column name="nom" length="30"/>
                </basic>
                <basic name="nacionalitat">
                    <column name="nacionalitat" length="12"/>
                </basic>
                <basic name="any_naixement">
                    <column name="any_naixement" length="4"/>
                </basic>
                <basic name="actiu">
                    <column name="actiu"  />
                </basic>
            </attributes>
        </entity>
    </entity-mappings>
    ```

    2. in an entity add the following content

    ```
    @Entity
    @Table( name = "autors" )
    public class Autor implements Serializable {
    @Id
    @Column(name = "id_autor")
    private  int id_autor;
    @Column(name = "nom")
    private  String nom;
    @Column(name = "nacionalitat")
    private  String nacionalitat;
    @Col    umn(name = "any_naixement")
    private  String any_naixement;
    @Column(name = "actiu")
    private  boolean actiu;
    }    
    ```

6. Create hibernate.cfg.xml //OPTIONAL To use other configuration

```
src/main/resources/hibernate.cfg.xml
```
```
<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE hibernate-configuration SYSTEM
        "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">

<hibernate-configuration>
    <session-factory>
        <property name="hibernate.dialect">
            org.hibernate.dialect.PostgreSQL9Dialect
        </property>
        <property name="hibernate.connection.driver_class">
            org.postgresql.Driver
        </property>

        <!-- Assume test is the database name -->
        <property name="hibernate.connection.url">
            <!--CHANGE IP AND DATABASE NAME-->
            jdbc:postgresql://192.168.22.121:5432/magazine
        </property>
        <property name="hibernate.connection.username">
            <!--CHANGE USER NAME-->
            usuario
        </property>
        <property name="hibernate.connection.password">
            <!--CHANGE PASSWD ACCESS-->
            usuario
        </property>

        <!-- List of XML mapping files -->

        <!--        <mapping resource="Autor.hbm.xml"/>-->
<!--        <mapping resource="Entities.Autor"/>-->

    </session-factory>
</hibernate-configuration>
```

