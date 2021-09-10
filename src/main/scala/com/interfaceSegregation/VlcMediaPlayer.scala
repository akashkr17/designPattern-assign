package com.interfaceSegregation

class VlcMediaPlayer extends VideoPlayer with AudioPlayer {
  def playVideo(): Unit = {
    println(" Playing video on Vlc Media Player..........")
  }

  def playAudio(): Unit = {
    println(" Playing audio on Vlc Media Player..........")
  }
}
