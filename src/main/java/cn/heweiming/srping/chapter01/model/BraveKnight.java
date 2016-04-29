/**
 * 
 */
package cn.heweiming.srping.chapter01.model;


/**
 * @author heweiming 2016年4月19日 下午10:07:02
 */
public class BraveKnight implements Knight {

	private Quest quest;

	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	@Override
	public void embarkOnQuest() {
		quest.embark();
	}

}
