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
