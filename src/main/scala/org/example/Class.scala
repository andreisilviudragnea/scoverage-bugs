/*
 * Copyright 2022 Andrei Silviu Dragnea
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
    ()
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
    ()
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
