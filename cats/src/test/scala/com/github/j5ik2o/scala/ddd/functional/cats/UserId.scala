package com.github.j5ik2o.scala.ddd.functional.cats

import com.github.j5ik2o.scala.ddd.functional.AggregateId

case class UserId(value: Long) extends AggregateId {
  override type IdValueType   = Long
  override type AggregateType = User
}
