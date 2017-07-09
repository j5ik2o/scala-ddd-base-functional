package com.github.j5ik2o.scala.ddd.functional

trait AggregateWriter extends AggregateIO {

  def store(aggregate: AggregateType)(implicit ctx: IOContext): DSL[Unit]

}
