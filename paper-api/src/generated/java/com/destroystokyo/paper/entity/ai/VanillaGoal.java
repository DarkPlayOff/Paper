

    GoalKey<Slime> SLIME_FLOAT = create("slime_float", Slime.class);

    GoalKey<Slime> SLIME_KEEP_ON_JUMPING = create("slime_keep_on_jumping", Slime.class);

    GoalKey<Slime> SLIME_RANDOM_DIRECTION = create("slime_random_direction", Slime.class);

    GoalKey<Spellcaster> SPELLCASTER_CASTING_SPELL = create("spellcaster_casting_spell", Spellcaster.class);

    GoalKey<Spider> SPIDER = create("spider", Spider.class);

    GoalKey<Spider> SPIDER_ATTACK = create("spider_attack", Spider.class);

    GoalKey<Squid> SQUID_FLEE = create("squid_flee", Squid.class);

    GoalKey<Squid> SQUID_RANDOM_MOVEMENT = create("squid_random_movement", Squid.class);

    GoalKey<Strider> STRIDER_GO_TO_LAVA = create("strider_go_to_lava", Strider.class);

    GoalKey<Tameable> FOLLOW_OWNER = create("follow_owner", Tameable.class);

    GoalKey<Tameable> NON_TAME_RANDOM = create("non_tame_random", Tameable.class);

    GoalKey<Tameable> OWNER_HURT = create("owner_hurt", Tameable.class);

    GoalKey<Tameable> OWNER_HURT_BY = create("owner_hurt_by", Tameable.class);

    GoalKey<Tameable> SIT_WHEN_ORDERED_TO = create("sit_when_ordered_to", Tameable.class);

    GoalKey<Tameable> TAMABLE_ANIMAL_PANIC = create("tamable_animal_panic", Tameable.class);

    GoalKey<Turtle> TURTLE_BREED = create("turtle_breed", Turtle.class);

    GoalKey<Turtle> TURTLE_GO_HOME = create("turtle_go_home", Turtle.class);

    GoalKey<Turtle> TURTLE_GO_TO_WATER = create("turtle_go_to_water", Turtle.class);

    GoalKey<Turtle> TURTLE_LAY_EGG = create("turtle_lay_egg", Turtle.class);

    GoalKey<Turtle> TURTLE_PANIC = create("turtle_panic", Turtle.class);

    GoalKey<Turtle> TURTLE_RANDOM_STROLL = create("turtle_random_stroll", Turtle.class);

    GoalKey<Turtle> TURTLE_TRAVEL = create("turtle_travel", Turtle.class);

    GoalKey<Vex> VEX_CHARGE_ATTACK = create("vex_charge_attack", Vex.class);

    GoalKey<Vex> VEX_COPY_OWNER = create("vex_copy_owner", Vex.class);

    GoalKey<Vex> VEX_RANDOM_MOVE = create("vex_random_move", Vex.class);

    GoalKey<Vindicator> VINDICATOR_JOHNNY_ATTACK = create("vindicator_johnny_attack", Vindicator.class);

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
