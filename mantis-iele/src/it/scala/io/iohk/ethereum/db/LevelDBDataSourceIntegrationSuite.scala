package io.iohk.ethereum.db

import io.iohk.ethereum.db.dataSource.{LevelDBDataSource, LevelDbConfig}
import org.scalatest.FlatSpec

class LevelDBDataSourceIntegrationSuite extends FlatSpec with DataSourceIntegrationTestBehavior {

  private def createDataSource(dataSourcePath: String) = LevelDBDataSource(new LevelDbConfig {
    override val verifyChecksums: Boolean = true
    override val paranoidChecks: Boolean = true
    override val createIfMissing: Boolean = true
    override val path: String = dataSourcePath
  })

  it should behave like dataSource(createDataSource)
}
