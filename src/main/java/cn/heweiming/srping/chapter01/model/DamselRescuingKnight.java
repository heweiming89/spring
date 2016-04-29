package cn.heweiming.srping.chapter01.model;

public class DamselRescuingKnight implements Knight {

	private RescueDamselQuest quest;

	public DamselRescuingKnight() {
		this.quest = new RescueDamselQuest();
	}

	@Override
	public void embarkOnQuest() {
		quest.embark();
	}
}
