package org.linlinjava.litemall.db.domain.vo;

import org.linlinjava.litemall.db.domain.LitemallUser;

public class LitemallUserVo extends LitemallUser {
    private Integer rank;

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
}
