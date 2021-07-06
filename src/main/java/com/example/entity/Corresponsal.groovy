package com.example.entity

import io.quarkus.hibernate.orm.panache.PanacheEntity

import javax.persistence.Column
import javax.persistence.Entity

@Entity
class Corresponsal  extends PanacheEntity {
  Long id
  String nombre
}
