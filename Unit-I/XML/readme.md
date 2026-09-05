## HTML

Hyper text Markup Language

## XML

- Extensive Markup Languange
- Used to store and exchange data between server and client
- there is not any predefine xml tags
- it should be developer defined
- all tags must be properly closed
- the tags name are case sensitive

```
<student>
    <id>101</id>
    <name> Neeraj Yadav</name>
    <branch> CSE</branch>
</student>
```

## DTD (Document Type Definition)

- fix the allowed tags
- sets their sequence
- set allowed attributes
- mandatory elements

```
<!DOCTYPE student System "student.dtd">
<student>
    <id>101</id>
    <name> Neeraj Yadav</name>
    <branch> CSE</branch>
</student>
```

student.dtd

```
<!ELEMENT student(name,age)>
<!ELEMENT name (#PCDATA)>
<!ELEMENT age (#PCDATA)>
<!ATTLIST student id ID #REQUIRED>
```

### Advantages of DTD

- Easy
- Small
- Good for simple XML

### Disadvantages DTD

- Not written in XML
- Limited data types
- can't validate complex structure

## XML Schema (XSD)

- written in XML
- advance than dtd
- supports large data types
- support restriction
- support namespace

```
<?xml version="1.0"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">
<xs:element name="student">
    <xs:complexType>
        <xs:sequence>
            <xs:element name="name" type:"xs:string"/>
            <xs:element name="age" type:"xs:int"/>
        </xs:sequence>
    </xs:complexType>
</xs:element>
<xs:schema>

```

### Valid XML

```
<student>
    <name>Neeraj Yadav</name>
    <age>20</age>
</student>
```

## XML Object Model (DOM)

Document Object Model

- it convert XML into tree structure
- every tag of xml becomes an object

### Features

- Read Nodes
- Modify Nodes
- Delete Nodes
- Add Nodes

install nodejs then

> npm init -y

DOMParser and QuerySelector are bydefault provided by browser, it can work in any browser directly. in NodeJs we have install some library to use it in terminal

## SAX Parser -> Simple API for XML

it reads one line -> process -> forget -> repeat
No Tree Created like DOM

### Working

XML -> Read Event -> Process -> Discard -> Next

```
<student>
    <name>Neeraj Yadav</name>
    <age>20</age>
</student>

```

SAX Events
Start Document -> Start Student -> Start name -> Text 'Neeraj Yadav' -> end name -> start age -> text 20 -> end age -> end student -> end document
