r.class);

    GoalKey<WanderingTrader> WANDER_TO_POSITION = create("wander_to_position", WanderingTrader.class);

    GoalKey<Wither> WITHER_DO_NOTHING = create("wither_do_nothing", Wither.class);

    GoalKey<Wolf> BEG = create("beg", Wolf.class);

    GoalKey<Wolf> WOLF_AVOID_ENTITY = create("wolf_avoid_entity", Wolf.class);

    GoalKey<Zombie> ZOMBIE_ATTACK = create("zombie_attack", Zombie.class);

    GoalKey<Zombie> ZOMBIE_ATTACK_TURTLE_EGG = create("zombie_attack_turtle_egg", Zombie.class);

    private static <T extends Mob> GoalKey<T> create(final String key, final Class<T> type) {
        return GoalKey.of(type, NamespacedKey.minecraft(key));
    }
}
