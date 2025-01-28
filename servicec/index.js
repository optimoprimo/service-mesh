const express = require("express");
require("dotenv").config();
const app = express();
const port = process.env.PORT || 8082;

//const tracer = Tracer.create("servicec", TRACE_COLLECTOR_URL, logger);

app.use(express.json());

app.get("/", (req, res) => {
  res.send("Service C");
});

app.listen(port, () => {
  console.log(`Servidor corriendo en http://localhost:${port}`);
});
