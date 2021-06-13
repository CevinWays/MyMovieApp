package com.submission1.utils

import com.google.gson.Gson
import com.submission1.data.Movie
import com.submission1.data.Tv

object DataDummy {
    private const val listMovies: String = """
            [
        {
            "adult": false,
            "backdrop_path": "/fPGeS6jgdLovQAKunNHX8l0avCy.jpg",
            "genre_ids": [
                28,
                12,
                53,
                10752
            ],
            "id": 567189,
            "original_language": "en",
            "original_title": "Tom Clancy's Without Remorse",
            "overview": "An elite Navy SEAL uncovers an international conspiracy while seeking justice for the murder of his pregnant wife.",
            "popularity": 5972.653,
            "poster_path": "/rEm96ib0sPiZBADNKBHKBv5bve9.jpg",
            "release_date": "2021-04-29",
            "title": "Tom Clancy's Without Remorse",
            "video": false,
            "vote_average": 7.3,
            "vote_count": 726
        },
        {
            "adult": false,
            "backdrop_path": "/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
            "genre_ids": [
                28,
                14,
                12
            ],
            "id": 460465,
            "original_language": "en",
            "original_title": "Mortal Kombat",
            "overview": "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
            "popularity": 5911.934,
            "poster_path": "/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
            "release_date": "2021-04-07",
            "title": "Mortal Kombat",
            "video": false,
            "vote_average": 7.7,
            "vote_count": 2295
        },
        {
            "adult": false,
            "backdrop_path": "/mYM8x2Atv4MaLulaV0KVJWI1Djv.jpg",
            "genre_ids": [
                28,
                80,
                53
            ],
            "id": 804435,
            "original_language": "en",
            "original_title": "Vanquish",
            "overview": "Victoria is a young mother trying to put her dark past as a Russian drug courier behind her, but retired cop Damon forces Victoria to do his bidding by holding her daughter hostage. Now, Victoria must use guns, guts and a motorcycle to take out a series of violent gangsters—or she may never see her child again.",
            "popularity": 4418.897,
            "poster_path": "/AoWY1gkcNzabh229Icboa1Ff0BM.jpg",
            "release_date": "2021-04-16",
            "title": "Vanquish",
            "video": false,
            "vote_average": 6.5,
            "vote_count": 73
        },
        {
            "adult": false,
            "backdrop_path": "/inJjDhCjfhh3RtrJWBmmDqeuSYC.jpg",
            "genre_ids": [
                878,
                28,
                18
            ],
            "id": 399566,
            "original_language": "en",
            "original_title": "Godzilla vs. Kong",
            "overview": "In a time when monsters walk the Earth, humanity’s fight for its future sets Godzilla and Kong on a collision course that will see the two most powerful forces of nature on the planet collide in a spectacular battle for the ages.",
            "popularity": 4015.861,
            "poster_path": "/pgqgaUx1cJb5oZQQ5v0tNARCeBp.jpg",
            "release_date": "2021-03-24",
            "title": "Godzilla vs. Kong",
            "video": false,
            "vote_average": 8.1,
            "vote_count": 5392
        },
        {
            "adult": false,
            "backdrop_path": "/6zbKgwgaaCyyBXE4Sun4oWQfQmi.jpg",
            "genre_ids": [
                28,
                53,
                80
            ],
            "id": 615457,
            "original_language": "en",
            "original_title": "Nobody",
            "overview": "Hutch Mansell, a suburban dad, overlooked husband, nothing neighbor — a \"nobody.\" When two thieves break into his home one night, Hutch's unknown long-simmering rage is ignited and propels him on a brutal path that will uncover dark secrets he fought to leave behind.",
            "popularity": 3247.949,
            "poster_path": "/oBgWY00bEFeZ9N25wWVyuQddbAo.jpg",
            "release_date": "2021-03-26",
            "title": "Nobody",
            "video": false,
            "vote_average": 8.5,
            "vote_count": 1321
        },
        {
            "adult": false,
            "backdrop_path": "/z7HLq35df6ZpRxdMAE0qE3Ge4SJ.jpg",
            "genre_ids": [
                28,
                12,
                35,
                14
            ],
            "id": 615678,
            "original_language": "en",
            "original_title": "Thunder Force",
            "overview": "In a world where supervillains are commonplace, two estranged childhood best friends reunite after one devises a treatment that gives them powers to protect their city.",
            "popularity": 2758.714,
            "poster_path": "/duK11VQd4UPDa7UJrgrGx90xJOx.jpg",
            "release_date": "2021-04-09",
            "title": "Thunder Force",
            "video": false,
            "vote_average": 5.8,
            "vote_count": 540
        },
        {
            "adult": false,
            "backdrop_path": "/pcDc2WJAYGJTTvRSEIpRZwM3Ola.jpg",
            "genre_ids": [
                28,
                12,
                14,
                878
            ],
            "id": 791373,
            "original_language": "en",
            "original_title": "Zack Snyder's Justice League",
            "overview": "Determined to ensure Superman's ultimate sacrifice was not in vain, Bruce Wayne aligns forces with Diana Prince with plans to recruit a team of metahumans to protect the world from an approaching threat of catastrophic proportions.",
            "popularity": 1999.263,
            "poster_path": "/tnAuB8q5vv7Ax9UAEje5Xi4BXik.jpg",
            "release_date": "2021-03-18",
            "title": "Zack Snyder's Justice League",
            "video": false,
            "vote_average": 8.5,
            "vote_count": 5363
        },
        {
            "adult": false,
            "backdrop_path": "/gzJnMEMkHowkUndn9gCr8ghQPzN.jpg",
            "genre_ids": [
                53,
                28,
                18
            ],
            "id": 793723,
            "original_language": "fr",
            "original_title": "Sentinelle",
            "overview": "Transferred home after a traumatizing combat mission, a highly trained French soldier uses her lethal skills to hunt down the man who hurt her sister.",
            "popularity": 1806.391,
            "poster_path": "/fFRq98cW9lTo6di2o4lK1qUAWaN.jpg",
            "release_date": "2021-03-05",
            "title": "Sentinelle",
            "video": false,
            "vote_average": 6,
            "vote_count": 374
        },
        {
            "adult": false,
            "backdrop_path": "/lHhc60NXYzswU4TvKSo45nY9Jzs.jpg",
            "genre_ids": [
                16,
                35,
                10751,
                12
            ],
            "id": 726684,
            "original_language": "fr",
            "original_title": "Miraculous World Shanghai, la légende de Ladydragon",
            "overview": "To join Adrien in Shanghai, Marinette is going to visit her uncle Wang who is celebrating his anniversary. But, as soon as she arrives in China, her purse gets stolen with Tikki inside, whom she needs to secretly transform into Ladybug! Without money and alone in the immense city, Marinette accepts the help of a young and resourceful girl, Fei. The two girls will ally and discover the existence of a new magical jewel, the Prodigious. Hawk Moth, also present in Shanghai, seeks to finding it since a long time...",
            "popularity": 1631.236,
            "poster_path": "/msI5a9TPnepx47JUb2vl88hb80R.jpg",
            "release_date": "2021-04-04",
            "title": "Miraculous World: Shanghai – The Legend of Ladydragon",
            "video": false,
            "vote_average": 7.8,
            "vote_count": 280
        },
        {
            "adult": false,
            "backdrop_path": "/xPpXYnCWfjkt3zzE0dpCNME1pXF.jpg",
            "genre_ids": [
                16,
                28,
                12,
                14,
                18
            ],
            "id": 635302,
            "original_language": "ja",
            "original_title": "劇場版「鬼滅の刃」無限列車編",
            "overview": "Tanjirō Kamado, joined with Inosuke Hashibira, a boy raised by boars who wears a boar's head, and Zenitsu Agatsuma, a scared boy who reveals his true power when he sleeps, boards the Infinity Train on a new mission with the Fire Hashira, Kyōjurō Rengoku, to defeat a demon who has been tormenting the people and killing the demon slayers who oppose it!",
            "popularity": 1626.033,
            "poster_path": "/h8Rb9gBr48ODIwYUttZNYeMWeUU.jpg",
            "release_date": "2020-10-16",
            "title": "Demon Slayer -Kimetsu no Yaiba- The Movie: Mugen Train",
            "video": false,
            "vote_average": 8.4,
            "vote_count": 888
        },
        {
            "adult": false,
            "backdrop_path": "/uQtqiAu2bBlokqjlURVLEha6zoi.jpg",
            "genre_ids": [
                80,
                18
            ],
            "id": 544401,
            "original_language": "en",
            "original_title": "Cherry",
            "overview": "Cherry drifts from college dropout to army medic in Iraq - anchored only by his true love, Emily. But after returning from the war with PTSD, his life spirals into drugs and crime as he struggles to find his place in the world.",
            "popularity": 1623.433,
            "poster_path": "/pwDvkDyaHEU9V7cApQhbcSJMG1w.jpg",
            "release_date": "2021-02-26",
            "title": "Cherry",
            "video": false,
            "vote_average": 7.5,
            "vote_count": 581
        },
        {
            "adult": false,
            "backdrop_path": "/c7dFSqZQYqNNJVpacpIGZe3gkLW.jpg",
            "genre_ids": [
                16,
                35,
                14
            ],
            "id": 813258,
            "original_language": "en",
            "original_title": "Monster Pets: A Hotel Transylvania Short",
            "overview": "Drac tries out some new monster pets to help occupy Tinkles for playtime.",
            "popularity": 1403.278,
            "poster_path": "/dkokENeY5Ka30BFgWAqk14mbnGs.jpg",
            "release_date": "2021-04-02",
            "title": "Monster Pets: A Hotel Transylvania Short",
            "video": false,
            "vote_average": 7.6,
            "vote_count": 85
        },
        {
            "adult": false,
            "backdrop_path": "/ovggmAOu1IbPGTQE8lg4lBasNC7.jpg",
            "genre_ids": [
                878,
                28,
                12,
                53
            ],
            "id": 412656,
            "original_language": "en",
            "original_title": "Chaos Walking",
            "overview": "Two unlikely companions embark on a perilous adventure through the badlands of an unexplored planet as they try to escape a dangerous and disorienting reality, where all inner thoughts are seen and heard by everyone.",
            "popularity": 1390.675,
            "poster_path": "/9kg73Mg8WJKlB9Y2SAJzeDKAnuB.jpg",
            "release_date": "2021-02-24",
            "title": "Chaos Walking",
            "video": false,
            "vote_average": 7.2,
            "vote_count": 541
        },
        {
            "adult": false,
            "backdrop_path": "/5Zv5KmgZzdIvXz2KC3n0MyecSNL.jpg",
            "genre_ids": [
                28,
                53,
                80
            ],
            "id": 634528,
            "original_language": "en",
            "original_title": "The Marksman",
            "overview": "Jim Hanson’s quiet life is suddenly disturbed by two people crossing the US/Mexico border – a woman and her young son – desperate to flee a Mexican cartel. After a shootout leaves the mother dead, Jim becomes the boy’s reluctant defender. He embraces his role as Miguel’s protector and will stop at nothing to get him to safety, as they go on the run from the relentless assassins.",
            "popularity": 1381.433,
            "poster_path": "/6vcDalR50RWa309vBH1NLmG2rjQ.jpg",
            "release_date": "2021-01-15",
            "title": "The Marksman",
            "video": false,
            "vote_average": 7.4,
            "vote_count": 430
        },
        {
            "adult": false,
            "backdrop_path": "/6TPZSJ06OEXeelx1U1VIAt0j9Ry.jpg",
            "genre_ids": [
                28,
                80,
                53
            ],
            "id": 587996,
            "original_language": "es",
            "original_title": "Bajocero",
            "overview": "When a prisoner transfer van is attacked, the cop in charge must fight those inside and outside while dealing with a silent foe: the icy temperatures.",
            "popularity": 1358.417,
            "poster_path": "/dWSnsAGTfc8U27bWsy2RfwZs0Bs.jpg",
            "release_date": "2021-01-29",
            "title": "Below Zero",
            "video": false,
            "vote_average": 6.4,
            "vote_count": 545
        },
        {
            "adult": false,
            "backdrop_path": "/zDq2pwPyt4xwSFHKUoNN2LohDWj.jpg",
            "genre_ids": [
                27
            ],
            "id": 632357,
            "original_language": "en",
            "original_title": "The Unholy",
            "overview": "Alice, a young hearing-impaired girl who, after a supposed visitation from the Virgin Mary, is inexplicably able to hear, speak and heal the sick. As word spreads and people from near and far flock to witness her miracles, a disgraced journalist hoping to revive his career visits the small New England town to investigate. When terrifying events begin to happen all around, he starts to question if these phenomena are the works of the Virgin Mary or something much more sinister.",
            "popularity": 1266.501,
            "poster_path": "/b4gYVcl8pParX8AjkN90iQrWrWO.jpg",
            "release_date": "2021-03-31",
            "title": "The Unholy",
            "video": false,
            "vote_average": 5.6,
            "vote_count": 77
        },
        {
            "adult": false,
            "backdrop_path": "/7prYzufdIOy1KCTZKVWpjBFqqNr.jpg",
            "genre_ids": [
                16,
                12,
                14,
                10751,
                28
            ],
            "id": 527774,
            "original_language": "en",
            "original_title": "Raya and the Last Dragon",
            "overview": "Long ago, in the fantasy world of Kumandra, humans and dragons lived together in harmony. But when an evil force threatened the land, the dragons sacrificed themselves to save humanity. Now, 500 years later, that same evil has returned and it’s up to a lone warrior, Raya, to track down the legendary last dragon to restore the fractured land and its divided people.",
            "popularity": 1228.888,
            "poster_path": "/lPsD10PP4rgUGiGR4CCXA6iY0QQ.jpg",
            "release_date": "2021-03-03",
            "title": "Raya and the Last Dragon",
            "video": false,
            "vote_average": 8.2,
            "vote_count": 2731
        },
        {
            "adult": false,
            "backdrop_path": "/srYya1ZlI97Au4jUYAktDe3avyA.jpg",
            "genre_ids": [
                14,
                28,
                12
            ],
            "id": 464052,
            "original_language": "en",
            "original_title": "Wonder Woman 1984",
            "overview": "A botched store robbery places Wonder Woman in a global battle against a powerful and mysterious ancient force that puts her powers in jeopardy.",
            "popularity": 1139.27,
            "poster_path": "/8UlWHLMpgZm9bx6QYh0NFoq67TZ.jpg",
            "release_date": "2020-12-16",
            "title": "Wonder Woman 1984",
            "video": false,
            "vote_average": 6.7,
            "vote_count": 5087
        },
        {
            "adult": false,
            "backdrop_path": "/sLK03Ed0D8EOoqLFBjrOcYSz8Tm.jpg",
            "genre_ids": [
                80,
                53,
                18
            ],
            "id": 579051,
            "original_language": "en",
            "original_title": "Silk Road",
            "overview": "The true story of Ross Ulbricht, the charismatic young tech-mastermind who unleashed the darknet website Silk Road, and the corrupt DEA agent determined to bring down his billion-dollar empire.",
            "popularity": 1086.084,
            "poster_path": "/6KxiEWyIDpz1ikmD7nv3GTX4Uoj.jpg",
            "release_date": "2021-02-19",
            "title": "Silk Road",
            "video": false,
            "vote_average": 6.9,
            "vote_count": 47
        },
        {
            "adult": false,
            "backdrop_path": "/drulhSX7P5TQlEMQZ3JoXKSDEfz.jpg",
            "genre_ids": [
                18,
                14,
                878
            ],
            "id": 581389,
            "original_language": "ko",
            "original_title": "승리호",
            "overview": "When the crew of a space junk collector ship called The Victory discovers a humanoid robot named Dorothy that's known to be a weapon of mass destruction, they get involved in a risky business deal which puts their lives at stake.",
            "popularity": 971.618,
            "poster_path": "/p9YDHJKvUoi7v2SCd3vLGPae1Xp.jpg",
            "release_date": "2021-02-05",
            "title": "Space Sweepers",
            "video": false,
            "vote_average": 7.2,
            "vote_count": 534
        }
    ]
        """
    private const val listTv: String = """
        [
                    {
                        "backdrop_path": "/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
                        "first_air_date": "2021-03-19",
                        "genre_ids": [
                            10765,
                            10759,
                            18,
                            10768
                        ],
                        "id": 88396,
                        "name": "The Falcon and the Winter Soldier",
                        "origin_country": [
                            "US"
                        ],
                        "original_language": "en",
                        "original_name": "The Falcon and the Winter Soldier",
                        "overview": "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                        "popularity": 1666.375,
                        "poster_path": "/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                        "vote_average": 7.9,
                        "vote_count": 5396
                    },
                    {
                        "backdrop_path": "/6UH52Fmau8RPsMAbQbjwN3wJSCj.jpg",
                        "first_air_date": "2021-03-26",
                        "genre_ids": [
                            16,
                            10759,
                            18,
                            10765
                        ],
                        "id": 95557,
                        "name": "Invincible",
                        "origin_country": [
                            "US"
                        ],
                        "original_language": "en",
                        "original_name": "Invincible",
                        "overview": "Mark Grayson is a normal teenager except for the fact that his father is the most powerful superhero on the planet. Shortly after his seventeenth birthday, Mark begins to develop powers of his own and enters into his father’s tutelage.",
                        "popularity": 1518.922,
                        "poster_path": "/yDWJYRAwMNKbIYT8ZB33qy84uzO.jpg",
                        "vote_average": 8.9,
                        "vote_count": 1483
                    },
                    {
                        "backdrop_path": "/Wu8kh7oyvaIfkNyMJyJHCamh5L.jpg",
                        "first_air_date": "2020-12-04",
                        "genre_ids": [
                            18
                        ],
                        "id": 97180,
                        "name": "Selena: The Series",
                        "origin_country": [
                            "US"
                        ],
                        "original_language": "en",
                        "original_name": "Selena: The Series",
                        "overview": "As Mexican-American Tejano singer Selena comes of age and realizes her dreams, she and her family make tough choices to hold on to love and music.",
                        "popularity": 1397.706,
                        "poster_path": "/mYsWyfiIMxx4HDm0Wck7oJ9ckez.jpg",
                        "vote_average": 7.5,
                        "vote_count": 1285
                    },
                    {
                        "backdrop_path": "/z59kJfcElR9eHO9rJbWp4qWMuee.jpg",
                        "first_air_date": "2014-10-07",
                        "genre_ids": [
                            18,
                            10765
                        ],
                        "id": 60735,
                        "name": "The Flash",
                        "origin_country": [
                            "US"
                        ],
                        "original_language": "en",
                        "original_name": "The Flash",
                        "overview": "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                        "popularity": 1202.958,
                        "poster_path": "/lJA2RCMfsWoskqlQhXPSLFQGXEJ.jpg",
                        "vote_average": 7.7,
                        "vote_count": 7559
                    },
                    {
                        "backdrop_path": "/zlXPNnnUlyg6KyvvjGd2ZxG6Tnw.jpg",
                        "first_air_date": "2017-09-25",
                        "genre_ids": [
                            18
                        ],
                        "id": 71712,
                        "name": "The Good Doctor",
                        "origin_country": [
                            "US"
                        ],
                        "original_language": "en",
                        "original_name": "The Good Doctor",
                        "overview": "A young surgeon with Savant syndrome is recruited into the surgical unit of a prestigious hospital. The question will arise: can a person who doesn't have the ability to relate to people actually save their lives",
                        "popularity": 1162.042,
                        "poster_path": "/53P8oHo9cfOsgb1cLxBi4pFY0ja.jpg",
                        "vote_average": 8.6,
                        "vote_count": 8323
                    },
                    {
                        "backdrop_path": "/hNiGqLsiD30C194lci7VYDmciHD.jpg",
                        "first_air_date": "2017-04-26",
                        "genre_ids": [
                            10765,
                            18
                        ],
                        "id": 69478,
                        "name": "The Handmaid's Tale",
                        "origin_country": [
                            "US"
                        ],
                        "original_language": "en",
                        "original_name": "The Handmaid's Tale",
                        "overview": "Set in a dystopian future, a woman is forced to live as a concubine under a fundamentalist theocratic dictatorship. A TV adaptation of Margaret Atwood's novel.",
                        "popularity": 1077.068,
                        "poster_path": "/oIkxqt6ug5zT5ZSUUyc1Iqopf02.jpg",
                        "vote_average": 8.2,
                        "vote_count": 1312
                    },
                    {
                        "backdrop_path": "/wkyzeBBKLhSg1Oqhky5yoiFF2hG.jpg",
                        "first_air_date": "2018-04-22",
                        "genre_ids": [
                            18
                        ],
                        "id": 79008,
                        "name": "Luis Miguel: The Series",
                        "origin_country": [
                            "MX"
                        ],
                        "original_language": "es",
                        "original_name": "Luis Miguel: La Serie",
                        "overview": "The series dramatizes the life story of Mexican superstar singer Luis Miguel, who has captivated audiences in Latin America and beyond for decades.",
                        "popularity": 969.116,
                        "poster_path": "/34FaY8qpjBAVysSfrJ1l7nrAQaD.jpg",
                        "vote_average": 8,
                        "vote_count": 392
                    },
                    {
                        "backdrop_path": "/sjxtIUCWR74yPPcZFfTsToepfWm.jpg",
                        "first_air_date": "2021-05-04",
                        "genre_ids": [
                            10765,
                            10759,
                            16
                        ],
                        "id": 105971,
                        "name": "Star Wars: The Bad Batch",
                        "origin_country": [
                            "US"
                        ],
                        "original_language": "en",
                        "original_name": "Star Wars: The Bad Batch",
                        "overview": "Follow the elite and experimental Clones of the Bad Batch as they find their way in a rapidly changing galaxy in the aftermath of the Clone Wars.",
                        "popularity": 914.77,
                        "poster_path": "/WjQmEWFrOf98nT5aEfUfVYz9N2.jpg",
                        "vote_average": 9,
                        "vote_count": 121
                    },
                    {
                        "backdrop_path": "/edmk8xjGBsYVIf4QtLY9WMaMcXZ.jpg",
                        "first_air_date": "2005-03-27",
                        "genre_ids": [
                            18
                        ],
                        "id": 1416,
                        "name": "Grey's Anatomy",
                        "origin_country": [
                            "US"
                        ],
                        "original_language": "en",
                        "original_name": "Grey's Anatomy",
                        "overview": "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                        "popularity": 887.665,
                        "poster_path": "/clnyhPqj1SNgpAdeSS6a6fwE6Bo.jpg",
                        "vote_average": 8.2,
                        "vote_count": 6009
                    },
                    {
                        "backdrop_path": "/ta5oblpMlEcIPIS2YGcq9XEkWK2.jpg",
                        "first_air_date": "2016-01-25",
                        "genre_ids": [
                            80,
                            10765
                        ],
                        "id": 63174,
                        "name": "Lucifer",
                        "origin_country": [
                            "US"
                        ],
                        "original_language": "en",
                        "original_name": "Lucifer",
                        "overview": "Bored and unhappy as the Lord of Hell, Lucifer Morningstar abandoned his throne and retired to Los Angeles, where he has teamed up with LAPD detective Chloe Decker to take down criminals. But the longer he's away from the underworld, the greater the threat that the worst of humanity could escape.",
                        "popularity": 706.217,
                        "poster_path": "/4EYPN5mVIhKLfxGruy7Dy41dTVn.jpg",
                        "vote_average": 8.5,
                        "vote_count": 8514
                    },
                    {
                        "backdrop_path": "/qZtAf4Z1lazGQoYVXiHOrvLr5lI.jpg",
                        "first_air_date": "2017-01-26",
                        "genre_ids": [
                            9648,
                            18,
                            80
                        ],
                        "id": 69050,
                        "name": "Riverdale",
                        "origin_country": [
                            "US"
                        ],
                        "original_language": "en",
                        "original_name": "Riverdale",
                        "overview": "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                        "popularity": 683.896,
                        "poster_path": "/wRbjVBdDo5qHAEOVYoMWpM58FSA.jpg",
                        "vote_average": 8.6,
                        "vote_count": 11206
                    },
                    {
                        "backdrop_path": "/5VltHQJXdmbSD6gEJw3R8R1Kbmc.jpg",
                        "first_air_date": "2016-09-23",
                        "genre_ids": [
                            9648,
                            10765,
                            10759
                        ],
                        "id": 65820,
                        "name": "Van Helsing",
                        "origin_country": [
                            "US"
                        ],
                        "original_language": "en",
                        "original_name": "Van Helsing",
                        "overview": "Vanessa Helsing, the daughter of famous vampire hunter and Dracula nemesis Abraham Van Helsing is resurrected five years in the future to find out that vampires have taken over the world and that she possesses unique power over them. She is humanity’s last hope to lead an offensive to take back what has been lost.",
                        "popularity": 560.347,
                        "poster_path": "/r8ODGmfNbZQlNhiJl2xQENE2jsk.jpg",
                        "vote_average": 6.9,
                        "vote_count": 549
                    },
                    {
                        "backdrop_path": "/58PON1OrnBiX6CqEHgeWKVwrCn6.jpg",
                        "first_air_date": "2015-08-23",
                        "genre_ids": [
                            10759,
                            18
                        ],
                        "id": 62286,
                        "name": "Fear the Walking Dead",
                        "origin_country": [
                            "US"
                        ],
                        "original_language": "en",
                        "original_name": "Fear the Walking Dead",
                        "overview": "What did the world look like as it was transforming into the horrifying apocalypse depicted in \"The Walking Dead\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.",
                        "popularity": 541.044,
                        "poster_path": "/4UjiPdFKJGJYdxwRs2Rzg7EmWqr.jpg",
                        "vote_average": 7.6,
                        "vote_count": 3492
                    },
                    {
                        "backdrop_path": "/suopoADq0k8YZr4dQXcU6pToj6s.jpg",
                        "first_air_date": "2011-04-17",
                        "genre_ids": [
                            10765,
                            18,
                            10759
                        ],
                        "id": 1399,
                        "name": "Game of Thrones",
                        "origin_country": [
                            "US"
                        ],
                        "original_language": "en",
                        "original_name": "Game of Thrones",
                        "overview": "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                        "popularity": 537.426,
                        "poster_path": "/u3bZgnGQ9T01sWNhyveQz0wH0Hl.jpg",
                        "vote_average": 8.4,
                        "vote_count": 14299
                    },
                    {
                        "backdrop_path": "/uro2Khv7JxlzXtLb8tCIbRhkb9E.jpg",
                        "first_air_date": "2010-10-31",
                        "genre_ids": [
                            10759,
                            18,
                            10765
                        ],
                        "id": 1402,
                        "name": "The Walking Dead",
                        "origin_country": [
                            "US"
                        ],
                        "original_language": "en",
                        "original_name": "The Walking Dead",
                        "overview": "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                        "popularity": 511.602,
                        "poster_path": "/rqeYMLryjcawh2JeRpCVUDXYM5b.jpg",
                        "vote_average": 8.1,
                        "vote_count": 10750
                    },
                    {
                        "backdrop_path": "/1i1N0AVRb54H6ZFPDTwbo9MLxSF.jpg",
                        "first_air_date": "2021-01-15",
                        "genre_ids": [
                            10765,
                            9648,
                            18
                        ],
                        "id": 85271,
                        "name": "WandaVision",
                        "origin_country": [
                            "US"
                        ],
                        "original_language": "en",
                        "original_name": "WandaVision",
                        "overview": "Wanda Maximoff and Vision—two super-powered beings living idealized suburban lives—begin to suspect that everything is not as it seems.",
                        "popularity": 434.267,
                        "poster_path": "/glKDfE6btIRcVB5zrjspRIs4r52.jpg",
                        "vote_average": 8.4,
                        "vote_count": 8393
                    },
                    {
                        "backdrop_path": "/pPKiIJEEcV0E1hpVcWRXyp73ZpX.jpg",
                        "first_air_date": "2021-02-23",
                        "genre_ids": [
                            10759,
                            10765,
                            18
                        ],
                        "id": 95057,
                        "name": "Superman & Lois",
                        "origin_country": [
                            "US"
                        ],
                        "original_language": "en",
                        "original_name": "Superman & Lois",
                        "overview": "After years of facing megalomaniacal supervillains, monsters wreaking havoc on Metropolis, and alien invaders intent on wiping out the human race, The Man of Steel aka Clark Kent and Lois Lane come face to face with one of their greatest challenges ever: dealing with all the stress, pressures and complexities that come with being working parents in today's society.",
                        "popularity": 429.744,
                        "poster_path": "/vlv1gn98GqMnKHLSh0dNciqGfBl.jpg",
                        "vote_average": 8.3,
                        "vote_count": 805
                    },
                    {
                        "backdrop_path": "/pLG4ihU1d2XkQbASQDjsFu9U7d9.jpg",
                        "first_air_date": "2021-03-24",
                        "genre_ids": [
                            18,
                            80,
                            9648
                        ],
                        "id": 120168,
                        "name": "Who Killed Sara?",
                        "origin_country": [
                            "MX"
                        ],
                        "original_language": "es",
                        "original_name": "¿Quién mató a Sara?",
                        "overview": "Hell-bent on exacting revenge and proving he was framed for his sister's murder, Álex sets out to unearth much more than the crime's real culprit.",
                        "popularity": 429.321,
                        "poster_path": "/o7uk5ChRt3quPIv8PcvPfzyXdMw.jpg",
                        "vote_average": 7.8,
                        "vote_count": 476
                    },
                    {
                        "backdrop_path": "/fRYwdeNjMqC30EhofPx5PlDpdun.jpg",
                        "first_air_date": "2018-10-25",
                        "genre_ids": [
                            10765,
                            18
                        ],
                        "id": 79460,
                        "name": "Legacies",
                        "origin_country": [
                            "US"
                        ],
                        "original_language": "en",
                        "original_name": "Legacies",
                        "overview": "In a place where young witches, vampires, and werewolves are nurtured to be their best selves in spite of their worst impulses, Klaus Mikaelson’s daughter, 17-year-old Hope Mikaelson, Alaric Saltzman’s twins, Lizzie and Josie Saltzman, among others, come of age into heroes and villains at The Salvatore School for the Young and Gifted.",
                        "popularity": 421.869,
                        "poster_path": "/qTZIgXrBKURBK1KrsT7fe3qwtl9.jpg",
                        "vote_average": 8.6,
                        "vote_count": 1849
                    },
                    {
                        "backdrop_path": "/xy92C7oWrvd31rHcwM0MhqI5s1x.jpg",
                        "first_air_date": "2001-08-24",
                        "genre_ids": [
                            10766,
                            35
                        ],
                        "id": 73481,
                        "name": "Ecomoda",
                        "origin_country": [
                            "CO"
                        ],
                        "original_language": "es",
                        "original_name": "Ecomoda",
                        "overview": "",
                        "popularity": 410.997,
                        "poster_path": "/yMwHYtRmbE91pFjorzgfgS6JpKn.jpg",
                        "vote_average": 7.7,
                        "vote_count": 688
                    }
                ]
    """

    fun generateDummyMovies(): List<Movie> =
        Gson().fromJson(listMovies, Array<Movie>::class.java).toList()

    fun generateDummyTv(): List<Tv> =
        Gson().fromJson(listTv, Array<Tv>::class.java).toList()
}