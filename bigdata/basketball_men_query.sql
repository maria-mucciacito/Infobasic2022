/* ESERCITAZIONE SQL - BASETABLL_MEN */



/* Nome dell’Highscool con relativo conteggio di giocatori; */

SELECT p.highschool, count(*)
FROM PLAYERS p
GROUP BY p.highschool;




/*Nome, cognome e punti totali dei 10 giocatori che hanno fatto più punti nelle loro carriere. */

SELECT p.playerID, p.firstname, p.lastname, sum(pt.points) as total_points
FROM PLAYERS p INNER JOIN PLAYERS_TEAMS pt ON (p.playerID = pt.playerID)
GROUP BY p.playerID, p.firstname, p.lastname
ORDER BY total_points DESC
LIMIT 10






/*Nome, cognome dei giocatori che non sono nati un USA ma che hanno giocato almeno in due squadre di nba. */

SELECT p.playerID, p.firstname, p.lastname, COUNT(DISTINCT(pt.tmID) as totale_squadre
FROM PLAYERS p INNER JOIN PLAYERS_TEAMS pt ON (p.playerID = pt.playerID)
WHERE p.birthCountry <> 'USA' 
GROUP BY p.playerID, p.firstname, p.lastname
HAVING totale_squadre > 1






/*Nome delle squadre con relativo conteggio di coach premiati. */

SELECT t.tmID, c.coachID, COUNT(*) as total_awards
FROM (TEAMS t INNER JOIN COACHES C on (t.year_teams=c.year_coach and t.tmID=c.tmID_coach)) 
			INNER JOIN AWARDS_COACHES ac on (ac.coach_ID = c.coachID and ac.year_award = c.year_coach)
GROUP BY t.tmID, c.coachID
ORDER BY total_awards DESC






/*Migliori giocatori sui seguenti aspetti: (partie giocate, minuti giocati, miglior marcatore, miglior assistman, miglior blocker, miglior tiratore da tre). */
CREATE VIEW tmp AS(
SELECT p.playerID, p.firstname, p.lastname, SUM(pt.GP) as partite_giocate, SUM(pt.minutes) as minuti_giocati, 
				SUM(points) as  punti, SUM(assists) as assists, SUM(blocks) as block, SUM(threeMade) as threeMade
FROM PLAYERS p INNER JOIN PLAYERS_TEAMS pt ON (p.playerID = pt.playerID)
GROUP BY p.playerID, p.firstname, p.lastname )

SELECT MAX(T.partite_giocate), t.firstname, t.lastname
FROM tmp t;
SELECT MAX(T.minuti_giocati), t.firstname, t.lastname
FROM tmp t;
SELECT MAX(T.punti), t.firstname, t.lastname
FROM tmp t; 
SELECT MAX(T.assists), t.firstname, t.lastname
FROM tmp t;
SELECT MAX(T.block), t.firstname, t.lastname
FROM tmp t;
SELECT MAX(T.threeMade), t.firstname, t.lastname
FROM tmp t; 





/*Per gli anni 00s, mostrare i 5 miglior giocatori con media punti.*/

SELECT p.playerID, p.firstname, p.lastname, AVG(pt.points) as avg_points
FROM PLAYERS p INNER JOIN PLAYERS_TEAMS pt ON (p.playerID = pt.playerID)
WHERE pt.year_pt >= 2000 and pt.year_pt <= 2010
GROUP BY p.playerID, p.firstname, p.lastname
ORDER BY avg_points DESC
LIMIT 5




/*Top 10 giocatori che hanno vinto più MVP awards. Per ogni giocatore mostriamo il numero di mvp ed i relativi anni in cui sono stati vinti. */

SELECT p.playerID, p.firstname, p.lastname, COUNT(*) as total_mvp
FROM PLAYERS p INNER JOIN AWARDS_PLAYERS ap ON (p.playerID = ap.playerID)
GROUP BY p.playerID, p.firstname, p.lastname 
ORDER BY total_mvp DESC
LIMIT 10
