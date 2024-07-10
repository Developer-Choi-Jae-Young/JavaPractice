package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.kh.practice.set.model.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet<Lottery> lottery = new HashSet<Lottery>();
	private HashSet<Lottery> win = new HashSet<Lottery>();

	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}

	public boolean deleteObject(Lottery l) {
		if((win != null) && lottery.remove(l)) {
			return win.remove(l);
		}
		
		return false;
	}

	public HashSet<Lottery> winObject() {
		List<Lottery> list = new ArrayList<Lottery>();

		for (Lottery lott : lottery) {
			list.add(lott);
		}

		while (win.size() < 4) {
			win.add(list.get((int) (Math.random() * list.size() - 1)));
		}
		// ���� ��÷�� ��Ͽ� ������ ��÷ ����ڰ� �ִٸ�
		// ������ ��÷�� ����� �����ϰ� ������ ����� �ڸ��� ���ο� ��÷�ڷ� ä��
		return this.win;
	}

	public TreeSet<Lottery> sortedWinObject() {
		TreeSet<Lottery> lott = new TreeSet<Lottery>(new SortedLottery());
		
		if(win != null && win.size() >= 4) {
			for(Lottery t : win) {				
				lott.add(t);
			}
		}
		
		return lott;
	}

	public boolean searchWinner(Lottery l) {
		for (Lottery lott : win) {
			if (lott.equals(l)) {
				return true;
			}
		}

		return false;
	}
}