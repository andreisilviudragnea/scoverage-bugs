package org.example

import com.typesafe.scalalogging.Logger

import java.util.concurrent.CompletableFuture

class Class(logger: Logger) {
  def brokenCoverage1(input: Option[String]): String = {
    input match {
      case Some(value) => value
      case None        => ""
    }
  }

  def brokenCoverage2(input: Option[String]): String = {
    input match {
      case Some(value) => {
        value
      }
      case None => ""
    }
  }

  def brokenCoverage3(): Unit = {
    CompletableFuture.completedFuture("").whenComplete { (_, throwable) =>
      Option(throwable) match {
        case Some(_) => logger.error("Error completing future")
        case None    => ()
      }
    }
  }

  def brokenCoverage4(): Unit = {
    CompletableFuture.completedFuture("").whenComplete { (_, throwable) =>
      Option(throwable) match {
        case Some(_) => {
          logger.error("Error completing future")
        }
        case None => ()
      }
    }
  }

  def brokenCoverage5(input: Option[String]): String = {
    input match {
      case Some(_) => s"something"
      case None    => ""
    }
  }

  def brokenCoverage6(input: Option[String]): String = {
    input match {
      case Some(value) => s"something $value"
      case None        => ""
    }
  }

  def brokenCoverage7(input: Option[String]): String = {
    input match {
      case Some(value) => {
        s"something $value"
      }
      case None => ""
    }
  }
}
