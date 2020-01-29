# Weatherforecast
Api weatherforecast on Java Springboot based.

# Use

Download or clone this project, then through IntelliJIDEA or another IDE, open the project, or just for execute CLI commands.

# Run
For next commands, you have to inside root path of application.

1. Build Application

> ./gradlew build

2. Run Application

> java -jar build/libs/app.jar

3. Deploy on docker

> <b>For create image:</b> docker build -f Dockerfile -t weatherforecast .
> <b>For deploy like a service:</b> docker-compose up -d --build --force-recreate

4. API Endpoint

Remember, the country and city only names, just like that.
> <b>http://localhost:8080/api/v1/weather/forecast?country=chile&city=santiago</b>

# Architecture

1. Scaffolding

+ src
+ main
	+ constants
	+ controllers   *WeatherRestController*
	+ database *For future caching implementation*
	+ exceptions *Empty by now*
	+ helpers *Utils helpers*
	+ models *Models of API*
	+ security *Empty by now*
	+ services *Weatherbit API client service*
	+ utils *Empty by now*
	+ WeatherforecastApplication.java
+ test
	+ integration
		+ WeatherForecastTests
		+ WheaterbitClientForecastTests
	+ units *Empty*
	+ WeatherforecastApplicationTests.java

2. Diagram
    
```flow
st=>start: WeatherRestController {Country, City}
op=>operation: Service Weatherbit API Client {Country, City}
cond=>condition: {Country, City} are valid?, Yes or Not?
e=>end: WeatherResponse (JsonData)

st->op->cond
cond(yes)->e
cond(no)->op
```

```seq
WeatherRequest->Weatherbit: Forecast {Country,City}
Note right of Weatherbit: Weatherbit {Country,City,DaysLimit}
Weatherbit-->WeatherRequest: This is my answer
WeatherRequest->>Weatherbit: Ok
```

Notes:
If diagrams not shown, just paste this readme source code on this editor.
http://editor.md.ipandao.com/examples/full.html


Enjoy it!.


# License
License under the terms of the GPLv3 License

The GPLv3 License (GPL)
Copyright © 2020 Mauricio Valencia

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the “Software”), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.




