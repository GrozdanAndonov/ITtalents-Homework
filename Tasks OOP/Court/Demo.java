import citizen.Accused;
import citizen.Accuser;
import citizen.Witness;
import court.Case;
import court.CivilCase;
import court.Court;
import legalEntity.Judge;
import legalEntity.Juror;
import legalEntity.Lawyer;
import legalEntity.Prosecutor;

public class Demo {

//	Реализирайте структура от класове, която да представлява работата на районен съд.
//	Всеки съд съдържа в себе си следните характеристики:
//	 Наименование;
//	 Адрес;
//	 Юридически лица (юристи);
//	 Списък с дела.
//	Всяко юридическо лице има следните характеристики
//	 Наименование;
//	 Длъжност;
//	 Стаж –брой години служба.
//	 Брой дела, в които са участвали.
//	Юридическите лица имат една от четири възможни длъжности: Съдия, Съдебен заседател, Адвокат и Прокурор.
//	Не може да има юридическо лице с повече от една длъжност.
//	Всяко юридическо лице трябва да има следните възможности:
//	 Да задава въпрос на гражданин;
//	 Да си води записки с отговорите на гражданите.
//	Съдиите в съда имат поне 5 години стаж.
//	Прокурорите имат поне 10 години стаж.
//	Адвокатите трябва да са участвали поне в 10 дела.
//	Граждани са обикновените хора, които не работят в съда, но могат да вземат участие в делото. 
//	Гражданите имат следните характеристики:
//	 Три имена;
//	 Адрес;
//	 Възраст;
//	Възможни са три роли на гражданите в едно дело: Обвиняем, Обвинител и Свидетел.
//	Обвиняемия и Обвинителя трябва да имат списък с адвокати. В списъка не може да има повтарящи се адвокати.
//	Съдът може да разглежда дела. Всяко дело има следните характеристики:
//	 Тип;
//	 Съдия, зачислен за делото;
//	 Съдебни заседатели, зачислени за делото. Ако делото е гражданско, съдебните заседатели са 3.
//	Ако е наказателно –съдебните заседатели са 13. Съдебните заседатели не могат да се повтарят за едно дело. 
//	Няма как един човек да е два пъти съдебен заседател в делото.

//	 Един обвиняем гражданин;
//	 Един обвинител. Ако делото е наказателно, обвинителя е прокурор. Ако делото е гражданско, обвинителя е гражданин;
//	 Списък със свидетели. Свидетелите не могат да се повтарят.
//	Всяко дело трябва да има метод „проведи“. При провеждане на делото се извършват следните операции:
//	 Всички юристи увеличават броя дела, в които са взели участие, с едно.
//	 Ако делото е гражданско, всеки адвокат на обвинителя задава по 3 въпроса на обвиняемия, след което задава по 2 въпроса на всеки от свидетелите.
//	 Ако делото е наказателно, прокурора задава 5 въпроса на обвиняемия, след което задава по 5 въпроса на всеки от свидетелите.
//	 Всеки адвокат на обвиняемия задава по 5 въпроса на свидетелите по делото.
//	 Всеки съдебен заседател взима решение дали обвиняемия е виновен на базата на произволна стойност. 
//	Ако повече от 50% от заседателите отсъдят еднакво, решението е окончателно.
//	 Съдията взима предвид решението на заседателите и ако те са отсъдили „виновен“, определя размера на присъдата отново на произволен принцип –от 3 до 40 години затвор.
//	 Хронологията на провеждане на делото да се записва в отделен текстов файл за всяко дело. Хронологията включва:
//	 Имената и длъжностите на участниците в делото –юристи и граждани;
//	 Кой на кого е задал въпрос по време на делото;
//	 Как са отсъдили заседателите;
//	 Каква е присъдата.
//	Да се реализира демо програма, която има следните възможности:
//	1. Създаване на районен съд –Велико Търново;
//	2. Създаване и вписване на различни юридически лица в съда –трима съдии, 10 съдебни заседателя, 5 адвоката и двама прокурори.
//	3. Създаване на граждани –5 обвинителя, 5 обвиняеми и 10 свидетеля.
//	4. Създаване на три граждански дела. За всяко дело юристите и гражданите се зачисляват на произволен принцип.
//	5. Създаване на три наказателни дела. За всяко дело юристите и гражданите се зачисляват на произволен принцип.
//	6. За всяко дело да се извика метода „проведи“.
//	7. Да се извика метод в Court класа, който изписва данните на всички юристи заедно с техния брой дела, в който са взимали участие.
//	Метода да се извика преди и след провеждане на всички дела. Метода да извежда юристите и техните дела.
	
	public static void main(String[] args) {
		
	
		
		Court court = new Court("Raionen Sud","Veliko Turnovo");
		
		court.addLegalEntity(new Judge("Judge1",5,4));
		court.addLegalEntity(new Judge("Judge2",6,10));
		court.addLegalEntity(new Judge("Judge3",9,9));
		
		court.addLegalEntity(new Juror("Juror1"));
		court.addLegalEntity(new Juror("Juror2"));
		court.addLegalEntity(new Juror("Juror3"));
		court.addLegalEntity(new Juror("Juror4"));
		court.addLegalEntity(new Juror("Juror5"));
		court.addLegalEntity(new Juror("Juror6"));
		court.addLegalEntity(new Juror("Juror7"));
		court.addLegalEntity(new Juror("Juror8"));
		court.addLegalEntity(new Juror("Juror9"));
		court.addLegalEntity(new Juror("Juror10"));
		court.addLegalEntity(new Juror("Juror11"));
		court.addLegalEntity(new Juror("Juror12"));
		court.addLegalEntity(new Juror("Juror13"));
		
		
		court.addLegalEntity(new Lawyer("Lawyer1",2,12));
		court.addLegalEntity(new Lawyer("Lawyer2",3,13));
		court.addLegalEntity(new Lawyer("Lawyer3",4,14));
		court.addLegalEntity(new Lawyer("Lawyer4",5,15));
		court.addLegalEntity(new Lawyer("Lawyer5",6,16));
		
		court.addLegalEntity(new Prosecutor("Prosecutor1",10,12));
		court.addLegalEntity(new Prosecutor("Prosecutor2",10,12));
		
		
		
		court.addCitizen(new Accuser("Accuser1","Sandanski",22));
		court.addCitizen(new Accuser("Accuser2","Sandanski",20));
		court.addCitizen(new Accuser("Accuser3","Sandanski",32));
		court.addCitizen(new Accuser("Accuser4","Sandanski",41));
		court.addCitizen(new Accuser("Accuser5","Sandanski",37));
		
		court.addCitizen(new Accused("Accused1","Sandanski",24));
		court.addCitizen(new Accused("Accused2","Sandanski",23));
		court.addCitizen(new Accused("Accused3","Sandanski",55));
		court.addCitizen(new Accused("Accused4","Sandanski",29));
		court.addCitizen(new Accused("Accused5","Sandanski",36));
		
		
		court.addCitizen(new Witness("Witness1","Sandanski",53));
		court.addCitizen(new Witness("Witness2","Sandanski",25));
		court.addCitizen(new Witness("Witness3","Sandanski",62));
		court.addCitizen(new Witness("Witness4","Sandanski",23));
		court.addCitizen(new Witness("Witness5","Sandanski",45));
		court.addCitizen(new Witness("Witness6","Sandanski",34));
		court.addCitizen(new Witness("Witness7","Sandanski",34));
		court.addCitizen(new Witness("Witness8","Sandanski",35));
		court.addCitizen(new Witness("Witness9","Sandanski",50));
		court.addCitizen(new Witness("Witness10","Sandanski",54));
		court.showInfoForJurists();
			
		court.createCase(true);
		court.createCase(true);
		court.createCase(true);
		
		court.createCase(false);
		court.createCase(false);
		court.createCase(false);
		
		court.showCases();
		
		court.runCases();
		court.showInfoForJurists();
		//court.showAllLegalEntities();
		
	}
	
	
}
