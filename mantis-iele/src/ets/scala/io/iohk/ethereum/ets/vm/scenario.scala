package io.iohk.ethereum.ets.vm

import akka.util.ByteString
import io.iohk.ethereum.domain.Address
import io.iohk.ethereum.ets.common.AccountState

case class VMScenario(
  env: Env,
  exec: Exec,
  callcreates: Option[List[CallCreate]],
  pre: Map[Address, AccountState],
  post: Option[Map[Address, AccountState]],
  logs: Option[ByteString],
  gas: Option[BigInt],
  out: Option[ByteString]
)

case class Env(
  currentCoinbase: Address,
  currentDifficulty: BigInt,
  currentGasLimit: BigInt,
  currentNumber: BigInt,
  currentTimestamp: Long,
  previousHash: Option[ByteString]
)

case class Exec(
  address: Address,
  origin: Address,
  caller: Address,
  value: BigInt,
  data: ByteString,
  code: ByteString,
  gasPrice: BigInt,
  gas: BigInt
)

case class CallCreate(
  data: ByteString,
  destination: Option[Address],
  gasLimit: BigInt,
  value: BigInt
)

