package com.example.entity

import com.example.json.Cantidades
import io.quarkus.hibernate.orm.panache.PanacheEntity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

@Entity
class Plazo extends PanacheEntity {
  String frecuencia
  Integer tiempo
  @OneToOne
  @JoinColumn(name = "cotizador_id")
  Cotizador cotizaodor
}
