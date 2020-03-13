package ru.geekbrains.part_2_lesson_3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
		//  1. Создать массив с набором слов (20-30 слов, должны встречаться повторяющиеся):
		String text = "Создайте Родину в себе, \n" +
				"Все ее долы, горы, реки. \n" +
				"Создайте Родину в себе, \n" +
				"Чтобы жила она навеки. \n" +
				"\n" +
				"Ее просторы и леса, \n" +
				"И небо синее над нею  – \n" +
				"Найдите Родину в себе, \n" +
				"Чтобы навеки слиться с нею. \n" +
				"\n" +
				"Ее не выбирают, нет. \n" +
				"Она дается нам как данность. \n" +
				"И пусть в ответ ее любовь \n" +
				"Вернется к вам, как благодарность. \n" +
				"\n" +
				"Любовью платят за любовь, \n" +
				"И за дела – ответ делами. \n" +
				"Создайте Родину, чтоб вновь \n" +
				"Она цвела под небесами. \n" +
				"\n" +
				"Сломайте нищету души, \n" +
				"И хмурый мир перевернется. \n" +
				"Храните Родину в себе, \n" +
				"И, может быть, она вернется.\n";
		String[] words = text.split("\\s*(\\s|,|!|\\?|-|\\.)\\s*");

		//  - Найти список слов, из которых состоит текст (дубликаты не считать);
		HashSet<String> wordsList = new HashSet<String>();
		for (int i = 0; i < words.length; i++) {
			wordsList.add(words[i]);
		}
		System.out.println(wordsList);

		//  - Посчитать сколько раз встречается каждое слово (использовать HashMap);
		Map<String, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			if (hashMap.containsKey(words[i])) {
				int wordsCounter = hashMap.get(words[i]);
				hashMap.put(words[i], wordsCounter + 1);
			} else {
				hashMap.put(words[i], 1);
			}
		}
		System.out.println(hashMap);

// 2. Написать простой класс PhoneBook(внутри использовать HashMap):
//  - В качестве ключа использовать фамилию
//  - В каждой записи всего два поля: phone, e-mail
//  - Отдельный метод для поиска номера телефона по фамилии
//  (ввели фамилию, получили ArrayList телефонов), и отдельный метод для поиска e-mail по фамилии.
//  Следует учесть, что под одной фамилией может быть несколько записей.
//  Итого должно получиться 3 класса Main, PhoneBook, Person.

		PhoneBook pb = new PhoneBook();

		pb.addPerson(new Person("Ivanov", "+79994654564"));
		pb.addPerson(new Person("Petrov", "+79994654564"));
		pb.addPerson(new Person("Sidorov", "+746545464544"));
		pb.addPerson(new Person("Sidorov", "+789632145865"));
		pb.addPerson(new Person("Fedorov", "+796345623032"));
		pb.addPerson(new Person("Ivanov", "+79992223344"));

		pb.addEmail("Ivanov", "afygfgfg@mail.ru");

		System.out.println(pb.getInfo("Ivanov"));
		System.out.println(pb.getInfo("Sidorov"));
		System.out.println(pb.getEmail("Petrov"));

	}
}



