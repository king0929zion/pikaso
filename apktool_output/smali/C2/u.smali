.class public final LC2/u;
.super Li2/c;
.source "SourceFile"

# interfaces
.implements LB2/f;


# instance fields
.field public final g:LB2/f;

.field public final h:Lg2/i;

.field public final i:I

.field public j:Lg2/i;

.field public k:Lg2/d;


# direct methods
.method public constructor <init>(LB2/f;Lg2/i;)V
    .locals 2

    sget-object v0, LC2/r;->d:LC2/r;

    sget-object v1, Lg2/j;->d:Lg2/j;

    invoke-direct {p0, v0, v1}, Li2/c;-><init>(Lg2/d;Lg2/i;)V

    iput-object p1, p0, LC2/u;->g:LB2/f;

    iput-object p2, p0, LC2/u;->h:Lg2/i;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    sget-object v0, LC2/t;->e:LC2/t;

    invoke-interface {p2, p1, v0}, Lg2/i;->l(Ljava/lang/Object;Lo2/e;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, p0, LC2/u;->i:I

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lg2/d;)Ljava/lang/Object;
    .locals 1

    :try_start_0
    invoke-virtual {p0, p2, p1}, LC2/u;->n(Lg2/d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object p2, Lh2/a;->d:Lh2/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :catchall_0
    move-exception p1

    new-instance v0, LC2/p;

    invoke-interface {p2}, Lg2/d;->o()Lg2/i;

    move-result-object p2

    invoke-direct {v0, p2, p1}, LC2/p;-><init>(Lg2/i;Ljava/lang/Throwable;)V

    iput-object v0, p0, LC2/u;->j:Lg2/i;

    throw p1
.end method

.method public final j()Li2/d;
    .locals 2

    iget-object v0, p0, LC2/u;->k:Lg2/d;

    instance-of v1, v0, Li2/d;

    if-eqz v1, :cond_0

    check-cast v0, Li2/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final k()Ljava/lang/StackTraceElement;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Lc2/j;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, LC2/p;

    invoke-virtual {p0}, LC2/u;->o()Lg2/i;

    move-result-object v2

    invoke-direct {v1, v2, v0}, LC2/p;-><init>(Lg2/i;Ljava/lang/Throwable;)V

    iput-object v1, p0, LC2/u;->j:Lg2/i;

    :cond_0
    iget-object v0, p0, LC2/u;->k:Lg2/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lg2/d;->t(Ljava/lang/Object;)V

    :cond_1
    sget-object p1, Lh2/a;->d:Lh2/a;

    return-object p1
.end method

.method public final n(Lg2/d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-interface/range {p1 .. p1}, Lg2/d;->o()Lg2/i;

    move-result-object v2

    invoke-static {v2}, Ly2/v;->d(Lg2/i;)V

    iget-object v3, v0, LC2/u;->j:Lg2/i;

    const/4 v4, 0x0

    if-eq v3, v2, :cond_0

    instance-of v5, v3, LC2/p;

    const/4 v6, 0x0

    if-nez v5, :cond_2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v5, LA/i;

    const/4 v6, 0x3

    invoke-direct {v5, v6, v0}, LA/i;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v3, v5}, Lg2/i;->l(Ljava/lang/Object;Lo2/e;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    iget v5, v0, LC2/u;->i:I

    if-ne v3, v5, :cond_1

    iput-object v2, v0, LC2/u;->j:Lg2/i;

    :cond_0
    move-object/from16 v2, p1

    goto/16 :goto_a

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Flow invariant is violated:\n\t\tFlow was collected in "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v0, LC2/u;->h:Lg2/i;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ",\n\t\tbut emission happened in "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ".\n\t\tPlease refer to \'flow\' documentation or use \'flowOn\' instead"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    check-cast v3, LC2/p;

    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "\n            Flow exception transparency is violated:\n                Previous \'emit\' call has thrown exception "

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v3, LC2/p;->d:Ljava/lang/Throwable;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", but then emission attempt of value \'"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\' has been detected.\n                Emissions from \'catch\' blocks are prohibited in order to avoid unspecified behaviour, \'Flow.catch\' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "<this>"

    invoke-static {v1, v3}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "\r\n"

    const-string v7, "\n"

    const-string v8, "\r"

    filled-new-array {v5, v7, v8}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const-string v7, "asList(...)"

    invoke-static {v5, v7}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Lx2/b;

    new-instance v8, Lx2/i;

    invoke-direct {v8, v5, v6}, Lx2/i;-><init>(Ljava/util/List;Z)V

    invoke-direct {v7, v1, v6, v6, v8}, Lx2/b;-><init>(Ljava/lang/String;IILx2/i;)V

    new-instance v5, Lq/B;

    const/4 v8, 0x2

    invoke-direct {v5, v1, v8}, Lq/B;-><init>(Ljava/lang/String;I)V

    new-instance v8, Lw2/e;

    invoke-direct {v8, v7, v5}, Lw2/e;-><init>(Lw2/f;Lo2/c;)V

    invoke-static {v8}, Lw2/h;->a0(Lw2/f;)Ljava/util/List;

    move-result-object v5

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_3
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Lx2/j;->k(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_3

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v7}, Ld2/m;->W(Ljava/lang/Iterable;)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v10

    move v11, v6

    :goto_2
    const/4 v12, -0x1

    if-ge v11, v10, :cond_6

    invoke-virtual {v9, v11}, Ljava/lang/String;->charAt(I)C

    move-result v13

    invoke-static {v13}, Lx/b;->c(C)Z

    move-result v13

    if-nez v13, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_6
    move v11, v12

    :goto_3
    if-ne v11, v12, :cond_7

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v11

    :cond_7
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_9

    move-object v8, v4

    goto :goto_5

    :cond_9
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Comparable;

    :cond_a
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Comparable;

    invoke-interface {v8, v9}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v10

    if-lez v10, :cond_a

    move-object v8, v9

    goto :goto_4

    :cond_b
    :goto_5
    check-cast v8, Ljava/lang/Integer;

    if-eqz v8, :cond_c

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_6

    :cond_c
    move v7, v6

    :goto_6
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-interface {v5}, Ljava/util/List;->size()I

    invoke-static {v5}, Ld2/l;->T(Ljava/util/List;)I

    move-result v8

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_13

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v11, v6, 0x1

    if-ltz v6, :cond_12

    check-cast v10, Ljava/lang/String;

    if-eqz v6, :cond_d

    if-ne v6, v8, :cond_e

    :cond_d
    invoke-static {v10}, Lx2/j;->k(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_e

    move-object v6, v4

    goto :goto_9

    :cond_e
    invoke-static {v10, v3}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz v7, :cond_11

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v6

    if-le v7, v6, :cond_f

    goto :goto_8

    :cond_f
    move v6, v7

    :goto_8
    invoke-virtual {v10, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    const-string v10, "substring(...)"

    invoke-static {v6, v10}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_9
    if-eqz v6, :cond_10

    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    move v6, v11

    goto :goto_7

    :cond_11
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Requested character count "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " is less than zero."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_12
    new-instance v1, Ljava/lang/ArithmeticException;

    const-string v2, "Index overflow has happened."

    invoke-direct {v1, v2}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_13
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v15, "..."

    const/16 v16, 0x0

    const-string v11, "\n"

    const-string v13, ""

    const/4 v14, -0x1

    move-object v10, v3

    move-object v12, v13

    invoke-static/range {v9 .. v16}, Ld2/k;->c0(Ljava/util/Collection;Ljava/lang/StringBuilder;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lo2/c;)V

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "toString(...)"

    invoke-static {v1, v3}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :goto_a
    iput-object v2, v0, LC2/u;->k:Lg2/d;

    sget-object v2, LC2/w;->a:LC2/v;

    iget-object v3, v0, LC2/u;->g:LB2/f;

    const-string v5, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>"

    invoke-static {v3, v5}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v3, v1, v0}, LB2/f;->b(Ljava/lang/Object;Lg2/d;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lh2/a;->d:Lh2/a;

    invoke-static {v1, v2}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    iput-object v4, v0, LC2/u;->k:Lg2/d;

    :cond_14
    return-object v1
.end method

.method public final o()Lg2/i;
    .locals 1

    iget-object v0, p0, LC2/u;->j:Lg2/i;

    if-nez v0, :cond_0

    sget-object v0, Lg2/j;->d:Lg2/j;

    :cond_0
    return-object v0
.end method
