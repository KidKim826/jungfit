-- DB 이름 : jungfit 
-- DB 생성

USE jungfit;
-- ///////////////////// trainers
INSERT INTO trainers
VALUES 
("ThankyouBUBU","thankyou","땅끄부부","thanku@naver.com","유튜브 구독자 300만"),
("GYMJONGKOOK","gym","짐종국","ggg@naver.com","가수 출신 트레이너"),
("힙으뜸","shim","힙으뜸","best@naver.com","힙짱 힙업 애플힙 전문"),
("피지컬갤러리","123","빡빡이아저씨","egg@naver.com","안녕 빡빡이아져씨야");

-- ///////////////////// users
-- users 비밀번호 아이디랑 동일함
select * from users;
INSERT INTO users
VALUES
(0,"jungah","9b60d3ee90a55eddec0a7e0e0914e9b2a5ea52262163b3e2599332897fd37937","김정아","kja@ssafy.com","이문동",14.1743,168,40,22,0,"힙으뜸",NULL,NULL),
(0,'heejung','c603faf8d4ffdd36858e61931a2b064a68f49d1cfc5a8700ec905daa56fec9d5','전희정','jhj@ssafy.com','상도동',14.6951,165,40,20,0,'GYMJONGKOOK',NULL,NULL),
(0,'ddasumi','5b61e05803a307a43a2977dbf338b2b10bb4fcfff33a4d3d98c62a22558cdc44','따수미','dsm@ssafy.com','별내동',10,200,40,21,	0,'GYMJONGKOOK',NULL,NULL),
(0,'migon','29747253c30badd6b7e8da6c09f766ef057174c10ef8cb8f8399faa70755f19a','미곤란','migoff@ssafy.com','가양동',13.6719,160,35,20,0,'힙으뜸',NULL,NULL),
(0,'dowoon','423924ee4e59f74487493145d08f3014032a59771a1bb5cec3501d112da1086e','이도운','ldw@ssafy.com','양평구 어디동',15.2355,190,55,21,0,NULL,NULL,NULL),
(0,'goonsun','ce7b287dfff291a22f9ecd23b93febdf5c3947cd63effc224436bb163dde040b','진군선','jgs@ssafy.com','마포구 무슨동',16.6205,190,60,22,0,'GYMJONGKOOK',NULL,NULL),
(0,'kbs','1aa0e15b13a71e1da9f59d7b4dd12a6f28cf24c1f26d70934efd258e669a1e45','김병수','kbs@ssafy.com','천안 어떤동',13.4378,189,48,20,0,NULL,NULL,NULL),	
(0,'ymk','f5672d1046a06b178bfc05bf5149882038a899e6712dee482070a9ebb2179494','양명균','ymk@ssafy.com','광주 어디동',15.7812,195,60,29,0,'피지컬갤러리',NULL,NULL);

-- ///////////////////// videos
INSERT videos VALUES
("HCnDDAMDKps","어깨후면.. 저는 이렇게 합니다..", "상체", 2678361, "GYMJONGKOOK"),
("Dw8PbebpF9w", "심으뜸 헬스장 상체운동 루틴 upper body gym workout routine", "상체", 765423, "힙으뜸"),
("Vx2yxXQ0Pkk", "🏅요일별운동🏅 목요일 상체집중 근력운동 15분 루틴!", "상체", 1238411, "힙으뜸"),
("4t9u85AHQR0", "🏅요일별운동🏅 화요일 등/허리 군살 모조리 파.괴.한.다💥 등운동 루틴", "상체", 332423, "힙으뜸"),
("8thMw9JyxBE","어깨 운동만 '한' 남자", "상체", 3763321, "GYMJONGKOOK"),
("u8u0RzwRko0","집’요한’ 상체 트레이닝... (ft. 영화 보이스)", "상체", 2865420, "GYMJONGKOOK"),
("Xs-oEIPQPI8", "김계란이 추천하는 가장 효율적인 상체 워밍업 루틴", "상체", 0, "피지컬갤러리"),
("FsTkLYaUh_o", "운동 전 필수! 상체 워밍업 (운동 효율증가)", "상체", 0, "피지컬갤러리"),
("BvPAdiCr6jQ", "ENG)하체비만 탈출하는 방법, 상하체불균형 가이드라인", "상체", 0, "힙으뜸"),
("yAv5Q_tEfkI", "어깨 운동 이걸로 끝!!! 상체라인 예쁘게 만드는 방법", "상체", 0, "힙으뜸"),
("IS5OA7GeBJc", "1분만에 상체살 끝장내기 1 MIN UPPER BODY&ARM FAT WORKOUT", "상체", 0, "ThankyouBUBU"),
("aoH7qNedO8k", "푸쉬업 해도 몸변화가 없는 이유 [운동의 정석]", "상체", 0, "피지컬갤러리"),
-- 복부 --
("QSZ0mUGO_CA", "(층간소음X, 설명O) 🔥짧고 굵게🔥 복근만들기 2주 챌린지", "복부", 1243, "힙으뜸"),
("s2pkdUiCRTM", "ENG)복근만들기 30일 챌린지 (feat. 최고의 복근운동)", "복부", 983745, "힙으뜸"),
("dDd1hVjqxEo", "초보자를 위한 하루 5분 복근 루틴 l 5 minutes abs workout", "복부", 72534, "힙으뜸"),
("rjPzvuWle04", "유독 왜 배만 나오는 걸까?", "복부", 0, "피지컬갤러리"),
("0L5gAT1fJaM","뱃살 아랫뱃살 최고의 운동", "복부", 0, "ThankyouBUBU"),
("eg_DipJ7UVk","뱃살 빠지는 최고의 운동 BEST", "복부", 0, "ThankyouBUBU"),
("MXezTFmhq9A", "걸으면서 뱃살 쭉쭉 빠지는 운동 [걸쭉빠 뱃살]", "복부", 3, "ThankyouBUBU"),
("iOSYLKBk894", "무.조.건! 뱃살 빠지는 운동 베스트5", "복부", 45, "ThankyouBUBU"),
("ZDU5n-i3fmQ", "뱃살 허벅지살 동시에 빠지는 운동 [일타쌍피 운동]", "복부", 4, "ThankyouBUBU"),
("ZQSq74FVOUU", "11자 복근 찾아내기(feat. 누구나 복근은 있다) ㅣ심으뜸 베스트 복근운동루틴", "복부", 0, "힙으뜸"),
("06D2t5orpds","ENG)복근의 정석. 복근운동할 때 허리 아픈 사람 클릭!", "복부", 0, "힙으뜸"),
("86F74fyD3uc","허리 아픈 사람을 위한 앉아서 코어 강화하는 법 (복근은 덤) (eng sub)", "복부", 0, "피지컬갤러리"),
-- 하체 --
("pDFuLG0xrsU", "🏅요일별운동🏅 금요일 하체집중 근력운동 15분 루틴!", "하체", 0, "힙으뜸"),
("48eKwtozuCo", "(층간소음X, 설명O) 🔥무조건 빠짐🔥 다이어트 다짐한 사람들 다 들어와!!", "하체", 0, "힙으뜸"),
("UBVPNC1FBgc", "스쿼트 전 필수! 웜업 스트레칭(부상방지)", "하체", 0, "피지컬갤러리"),
("EBjYQeeBI-0", "완벽한 데드리프트 강의 [운동의 정석]", "하체", 0, "피지컬갤러리"),
("u5OgcZdNbMo","저는 '하체'식주의자 입니다..", "하체", 0, "GYMJONGKOOK"),
("jDQ_42bNT-Q","의자.. 다들 보이시죠?", "하체", 0, "GYMJONGKOOK"),
("NDsjmxTROEo","하체비만 11자다리 최고의 운동 [하체 핵매운맛]", "하체", 0, "ThankyouBUBU"),
("LK9e6mg4cmQ","허벅지살 다리살 최고의 운동", "하체", 0, "ThankyouBUBU"),
("UaX5G9pHvUM", "ENG) 상하체불균형 : 하체비만 운동법 I Leg fat burning workout and stretch", "하체", 0, "힙으뜸"),
("_Lwlrakp-c4", "그레이와 두근두근 하체 데이트", "하체", 0, "힙으뜸"),
("SGUkvhmo_GY", "심으뜸 스쿼트 300개 챌린지 (feat.힙업/하체다이어트)", "하체", 0, "힙으뜸"),
("8huELKrHK8c", "불.안.정 하십니까? (스쿼트, 벤치프레스 Tip)", "하체", 0, "피지컬갤러리"),
("36B7AoO5YpQ","초보자는 꼭 피해야 할 데드리프트 방식!? [탱커부부]", "하체", 0, "피지컬갤러리"),
("6R_V7Yofudg","무.조.건! 허벅지살 빠지는 운동", "하체", 0, "ThankyouBUBU"),
-- 전신 --
("Lr_Xy0t2DCU","피티(PT)기는 운동", "전신", 0, "GYMJONGKOOK"),
("gMaB-fG4u4g","전신 다이어트 최고의 운동 [칼소폭 찐 핵핵매운맛]", "전신", 0, "ThankyouBUBU"),
("YOw7EIz34QE","3분만에 전신 다이어트 끝장내기 3 MIN FULL BODY WORKOUT [Billie Eilish - bad guy]", "전신", 0, "ThankyouBUBU"),
("2LyDkE7sDec","초간단! 전신 스트레칭 끝판왕 BEST5", "전신", 0, "ThankyouBUBU"),
("A5MzlPgNcJM", "(근육통주의!!!!) 🔥올인원🔥 전신 근력운동 50분 홈트레이닝", "전신", 0, "힙으뜸"),
("lPtENEtGDYU", "(층간소음X) 설명 다 퍼주는 심으뜸 올인원 전신운동 50분루틴", "전신", 0, "힙으뜸"),
("W8JpE-sdUAs", "층간소음X 역대급 전신운동 50분루틴 I 1000kcal full body workout", "전신", 0, "힙으뜸"),
("H7QollPZa9Q", "8MIN TABATA WORKOUT I 전신 고강도 타바타 8분 (진짜힘듦주의)", "전신", 0, "힙으뜸"),
("mM09ELLrN7s", "살이 빠질 수 밖에 없는 전신운동루틴 2탄!!! 수건 꼭 준비하세요...", "전신", 0, "힙으뜸"),
("MX-oyQkebNQ", "매일 아침을 깨우는 25분 전신운동루틴 I 25 MIN GOOD MORNING WORKOUT - Stretch & Train (No Equipment)", "전신", 0, "힙으뜸"),
("e4WnrhXTjg8","몰디브에서 운동 한 잔..", "전신", 0, "GYMJONGKOOK"),
("5zvX5qv_HSw","제가.. 유튜브를... 시작합니다", "전신", 0, "GYMJONGKOOK");

-- ///////////////////// video_reviews
INSERT INTO video_reviews
VALUES
(0, "2LyDkE7sDec", "ymk", "운동 재밌다", now(),"사실 아니다 뻥이다", 0),
(0, "2LyDkE7sDec", "goonsun", "땀빼고 왔다", now(),"더워더워더워둬워", 0),
(0, "4t9u85AHQR0", "ddasumi", "승모근 조져", now(),"우왕아앙앙", 0),
(0, "4t9u85AHQR0", "migon", "미곤이 수영했다", now(),"우왕아앙앙", 0),
(0, "_Lwlrakp-c4", "dowoon", "오늘도 운동했다", now(),"존맛탱구탱구탱구야놀자", 0),
(0, "_Lwlrakp-c4", "migon", "미곤이는 오늘도 수영중", now(),"미곤이는 호흡곤란", 0),
(0, "_Lwlrakp-c4", "ddasumi", "수미수미", now(),"따수미", 0),
(0, "_Lwlrakp-c4", "ymk", "안뇽", now(),"나는 광주에서 고기나 뜯어야지", 0),
(0, "06D2t5orpds", "ymk", "오운완", now(),"수미는따수미속에서따수미", 0),
(0, "06D2t5orpds", "migon", "미곤이는 미곤란", now(),"미곤이는수미따라따수미속에서따수미", 0),
(0, "06D2t5orpds", "kbs", "박수치는중", now(),"수미는따수미따숨따숨따수미", 0),
(0, "06D2t5orpds", "ymk", "에에에에에엥", now(),"세균맨처치완료", 0),
(0, "6R_V7Yofudg", "ddasumi", "따수미아닌따술미", now(),"수미는디코나들어가야지", 0),
(0, "6R_V7Yofudg", "goonsun", "좋다", now(),"따땃하다", 0),
(0, "6R_V7Yofudg", "ymk", "여름이다", now(),"덥다더워", 0),
(0, "6R_V7Yofudg", "migon", "수영장은", now(),"싸늘하다", 0),
(0, "pDFuLG0xrsU","ymk","운동 재밌다",now(),"뻥이다",0),
(0, "pDFuLG0xrsU","migon","호흡곤란 미곤란",now(),"호곤",0),
(0, "pDFuLG0xrsU","ddasumi","수미수미",now(),"따수미",0),
(0, "pDFuLG0xrsU","kbs","오늘은",now(),"나는솔로 하는날",0),
(0, "2LyDkE7sDec", "migon", "미곤이는 미곤란", now(),"미곤이는 호흡곤란", 0),
(0, "2LyDkE7sDec", "ddasumi", "수미는 오늘도 필라테스", now(),"필라테스 조항조하", 0),
(0, "2LyDkE7sDec", "dowoon", "오늘도 운동했다", now(),"존맛탱구탱구탱구야놀자", 0),
(0, "2LyDkE7sDec", "migon", "미곤이는 오늘도 수영중", now(),"미곤이는 호흡곤란", 0);
INSERT INTO video_reviews
VALUES
(0, "2LyDkE7sDec", "heejung", "운동 재밌다", now(),"사실 아니다 뻥이다", 0),
(0, "2LyDkE7sDec", "jungah", "운동 재밌다", now(),"사실 아니다 뻥이다", 0);


-- /////////////////////managers
-- 둘 다 pw: 1234
INSERT INTO managers
VALUES
( "h2j0", "03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4", "전희정", "jung1@naver.com", "010-1234-1234", "KING"),
( "moopama", "03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4", "김정아", "jung2@naver.com", "010-1234-1234", "KING");

-- //////////////////// 
select * from followers;
insert into followers
values
("heejung","jungah"),
("goonsun","jungah"),
("ddasumi","jungah"),
("ymk","jungah"),
("migon","jungah"),
("dowoon","jungah"),
("kbs","jungah"),
("jungah","heejung"),
("dowoon","heejung"),
("kbs","heejung"),
("ddasumi","heejung"),
("jungah","migon"),
("jungah","ddasumi"),
("goonsun","dowoon"),
("dowoon","kbs"),
("kbs","dowoon"),
("ymk","ddasumi");

INSERT INTO messages VALUES
(0,"heejung","jungah","오늘 운동했어?",0),
(0,"jungah","heejung","나 아직,,,, 너는?",0),
(0,"heejung","jungah","나도 아직ㅜ 이제 가려고.. 이따 같이하자",0),
(0,"jungah","heejung","그래 좋아 7시에 만나자",0),
(0,"heejung","jungah","오키 이따봐",0); 



