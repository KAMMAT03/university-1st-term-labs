
APRO1, semestr 22Z, Kamil Matuszewski, nr albumu 324931, grupa LAB102, godz. 14:15

**Sprawozdanie z laboratorium nr 8**

1. Program wypisze wartości lowCounter = 1 000 000 * 2/3, a highCounter = 1 000 000 * 1/3, randomnumber generuje liczby do MAX_VALUE, jednakze akceptuje jedynie te, ktore sa mniejsze od max ktore jest rowne 2/3 * MAX_VALUE. Z tego wynika ze wszystkie wartosci lowCounter sa akceptowane, a tylko tylko polowa tych highCounter jest akceptowana. Stad mamy stosunek 2:1.
2. Stosowanie tablicy nie jest konieczne, mozna zamiast tego skorzystac z kolejki.
3. Zgodnie z przewidywaniami wartosci dla lowCounter to okolo 666 666, a dla highCounter to okolo 333 333. Polecana biblioteka to ThreadLocalRandom. Bierze ona pod uwage watki, ponieważ pomaga to w multitaskingu.
4. To rozwiazanie pasowaloby do np. spisu ksiazek bibliotecznych, gdzie wazny jest szybki dostep do informacji o dostepnosci danej pozycji.

Własne uwagi, komentarze, wnioski...