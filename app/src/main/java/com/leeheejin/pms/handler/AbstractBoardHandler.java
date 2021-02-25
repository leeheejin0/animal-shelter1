package com.leeheejin.pms.handler;

import java.util.List;
import com.leeheejin.pms.domain.Board;

public abstract class AbstractBoardHandler implements Command {

  protected List<Board> boardList;

  public AbstractBoardHandler(List<Board> boardList) {
    this.boardList = boardList;
  }

  protected boolean findByPw(int index, int password) {
    Board b = boardList.get(index - 1);
    if (b.getPassword() == password) {
      return true;
    }
    return false;
  }
}