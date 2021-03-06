package com.github.dito04.talarlista.speakerlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class SpeakerList {
  private final List<Speaker> firstList = new ArrayList<>();
  private final List<Speaker> secondList = new ArrayList<>();

  Optional<Speaker> getNextSpeaker() {
    return getFirstSpeaker();
  }

  private Optional<Speaker> getFirstSpeaker() {
    return Stream.concat(firstList.stream(), secondList.stream())
        .filter(Speaker::haveNotSpoken)
        .findFirst();
  }

  void addToFirstList(String body) {
    firstList.add(new Speaker(body));
  }

  void addToSecondList(String body) {
    secondList.add(new Speaker(body));
  }

  List<Speaker> getFirstList() {
    return new ArrayList<>(firstList);
  }

  List<Speaker> getSecondList() {
    return new ArrayList<>(secondList);
  }

  void removeFistSpeaker() {
    getFirstSpeaker().ifPresent(Speaker::setHaveSpoken);
  }

  void resetFirst() {
    firstList.clear();
  }

  void resetSecond() {
    secondList.clear();
  }
}
