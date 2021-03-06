# 1337-130T
An open source multi-indicator crypto-currency bot using Kotlin. (In Development)

## (In Development) (NO ETA)
I will update this description as I progress.

## Mission Statement
1337 130T is planning to be an open source crypto-currency bot using Kotlin. Which as you may be thinking, with a quick search on GitHub you can find dozens of other options, what will make this different? Well from my observations, many rely on a single indicator which can lead to profit losses over time. While some do allow for user-created indicators, it becomes clunky when trying to apply multiple strategies. Then comes the user-friendliness factor, as many free options available are command line tools, which have wonderful potential, though many users find them difficult to work with. These are the problem in which I intend to aid. First by implementing an easy to use multi-indicator structure, which will allow users to run multiple strategies side-by-side, like for example _MACD & RSI_. Secondly creating a user-friendly interface, which allows users, even who dislike command line tools, to run the application with ease.

## The Problems I Hope To Fix
As I said earlier in the mission statement, many other bots available `rely on a single indicator which can lead to profit losses over time`. This means that relying on a single indicator, such an `RSI`, `MACD`. or `Stochastics Oscillator`, can lead to losses due to the bots inability to see other environmental factors. This is why I believe a multi-indicator structure can lead to better results. Below we can see an example of this problem using a `Stochastics Oscillator` over `500` `15-minute` periods trading `XVG/ETH`.
![Screenshot](https://github.com/1301313Y/binance-trader/blob/master/img/stoch_graph_example.PNG)

## Design Structure
When it comes to design, I'm a visual person. I like to see what something will look like before I ever start working. Which is why I hope this structure will help some people see the basic concept of the design. While this design is basic and does not include much detail, it will be the skeleton of this project. _Please note this design is subject to change!_

![Screenshot](https://i.imgur.com/ZHRV3XH.png)

## Core Languages:
* Java 8+
* Kotlin 1.2.21+

## What Is Kotlin?
_"Kotlin is a statically-typed programming language that runs on the Java virtual machine and also can be compiled to JavaScript source code or use the LLVM compiler infrastructure. Its primary development is from a team of JetBrains programmers based in Saint Petersburg, Russia. While the syntax is not compatible with Java, Kotlin is designed to interoperate with Java code and is reliant on Java code from the existing Java Class Library, such as the collections framework. Kotlin uses aggressive type inference to determine the type of values and expressions for which type has been left unstated. This reduces language verbosity relative to Java, which demands often entirely redundant type specifications. (Wikipedia)"_

* [Project Website](https://kotlinlang.org/)
* [Tutorials](https://kotlinlang.org/docs/tutorials/)

## Planned Exchanges (In Order)
1. [Binance](https://www.binance.com)
2. [Kraken](https://www.kraken.com/)
3. TBA

## Inspiration
* [Gekko](https://github.com/askmike/gekko)
* [Binance Trader](https://github.com/yasinkuyu/binance-trader)
