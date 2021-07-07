package com.example

import com.example.entity.Corresponsal
import com.example.entity.Cotizador
import com.example.entity.Plazo

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/")
class ExampleResource {

  @GET
  @Path("/hello")
  @Produces(MediaType.TEXT_PLAIN)
  String hello() {
    "Hola mundo"
  }

  @GET
  @Path("/corresponsalList")
  @Produces(MediaType.APPLICATION_JSON)
  List<Corresponsal> corresponsalList() {
    List<Corresponsal> corresponsalList = Corresponsal.listAll()
    corresponsalList
  }

  @GET
  @Path("/cotizadorList")
  @Produces(MediaType.APPLICATION_JSON)
  List<Cotizador> cotizadorList() {
    List<Cotizador> cotizadorList = Cotizador.listAll()
    cotizadorList
  }

  @GET
  @Path("/plazoList")
  @Produces(MediaType.APPLICATION_JSON)
  List<Plazo> plazoList() {
    List<Plazo> plazoList = Plazo.listAll()
    plazoList
  }
}
