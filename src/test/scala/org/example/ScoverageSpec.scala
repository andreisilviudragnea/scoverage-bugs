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
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should
import org.slf4j.LoggerFactory

class ScoverageSpec extends AnyFunSuite with should.Matchers {

  test("scoverage") {
    val logger: Logger = Logger(LoggerFactory.getLogger("[Gomez]"))
    new Class(logger).brokenCoverage1(None) shouldBe ""
    new Class(logger).brokenCoverage2(None) shouldBe ""
    new Class(logger).brokenCoverage3() shouldBe ()
    new Class(logger).brokenCoverage4() shouldBe ()
    new Class(logger).brokenCoverage5(None) shouldBe ""
    new Class(logger).brokenCoverage6(None) shouldBe ""
    new Class(logger).brokenCoverage7(None) shouldBe ""
  }
}
