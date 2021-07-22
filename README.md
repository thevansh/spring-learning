# spring-learning


Notes:-
* Contructor Injection using Qualifier annotation
  @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {

    }
* For "prototype" scoped beans, Spring does not call the @PreDestroy method. 
