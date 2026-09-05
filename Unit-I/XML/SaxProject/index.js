import sax from "sax";

const parser = sax.parser(true);

parser.onopentag = (node) => {
  console.log(`start: ${node.name}`);
};
parser.ontext = (text) => {
  if (text.trim()) console.log(`Text: ${text}`);
};

parser.onclosetag = (tag) => {
  console.log(`End: ${tag}`);
};

parser.onerror = (err) => {
  console.error(err.message);
};
parser
  .write(
    `
    <student>
    <name>Neeraj Yadav</name>
    <age>20</age>
</student>
    `,
  )
  .close();
