package com.tiantao.spark.streaming.handler.impl

import com.tiantao.spark.streaming.handler.BaseHandler
import org.apache.spark.streaming.dstream.DStream

/**
  * 测试Streaming处理
  */
class TestStreamingHandler extends BaseHandler {
  /**
    * 运行handler(子类实现)
    */
  override def run(dStream: DStream[(String, String)]): Unit = {



    dStream.print()
  }
}
