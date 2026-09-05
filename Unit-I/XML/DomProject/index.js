import { parseXML, printStudent } from "./xmlParser.js";
// import { fs } from "fs/promises";

const xml = `
<student>
    <name>Karun Tyagi</name>
    <age>20</age>
    <email>neeraj@test.com</email>
</student>`;
const doc = parseXML(xml);
printStudent(doc);
