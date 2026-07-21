1. To select date where month is 03
SELECT * FROM coviddb.covid_19_india WHERE Month(Date)='03';

2. TO get the ConfirmedForeignNational and ConfirmedIndianNational =0
SELECT * FROM coviddb.covid_19_india WHERE ConfirmedForeignNational = 0 AND ConfirmedIndianNational = 0;



