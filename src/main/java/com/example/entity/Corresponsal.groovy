package com.example.entity

import io.quarkus.hibernate.orm.panache.PanacheEntity

import javax.persistence.Entity

@Entity
class Corresponsal  extends PanacheEntity {
  Integer id
  String nombre
}
