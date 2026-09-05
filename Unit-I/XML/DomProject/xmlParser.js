export const parseXML = (xmlText) => {
  const parser = new DOMParser();
  return parser.parseFromString(xmlText, "application/xml");
};

export const printStudent = (xmlDoc) => {
  console.log(xmlDoc);

  const name = xmlDoc.querySelector("name").textContent;
  const age = xmlDoc.querySelector("age").textContent;
  const email = xmlDoc.querySelector("email").textContent;
  //   console.log(xmlDoc.getElementByTagName("name")[0].textContent);
  document.getElementById("name").textContent = name;
  document.getElementById("age").textContent = age;
  document.getElementById("email").textContent = email;

  console.log(name, " ", age, " ", email);
};
