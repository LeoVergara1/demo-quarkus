package com.example.entity

import io.quarkus.hibernate.orm.panache.PanacheEntity

import javax.persistence.Entity
import javax.persistence.OneToOne

@Entity
class Corresponsal  extends PanacheEntity {
  String nombre
}
