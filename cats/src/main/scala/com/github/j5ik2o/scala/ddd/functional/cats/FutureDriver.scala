package com.github.j5ik2o.scala.ddd.functional.cats

import scala.concurrent.{ ExecutionContext, Future }

trait FutureDriver extends Driver {
  override type DSL[A]              = Future[A]
  override type SingleResultType[A] = Option[A]
  override type IOContextType       = ExecutionContext
}
