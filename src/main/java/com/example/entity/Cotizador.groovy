package com.example.entity

import io.quarkus.hibernate.orm.panache.PanacheEntity

import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

@Entity
class Cotizador extends PanacheEntity {

  String nombre
  @OneToOne
  @JoinColumn(name = "corresponsal_id")
  Corresponsal corresponsal
}
