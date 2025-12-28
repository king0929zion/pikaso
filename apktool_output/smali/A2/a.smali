.class public final LA2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/p0;


# instance fields
.field public d:Ljava/lang/Object;

.field public e:Ly2/f;

.field public final synthetic f:LA2/b;


# direct methods
.method public constructor <init>(LA2/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA2/a;->f:LA2/b;

    sget-object p1, LA2/d;->p:LD2/w;

    iput-object p1, p0, LA2/a;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(LD2/u;I)V
    .locals 1

    iget-object v0, p0, LA2/a;->e:Ly2/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ly2/f;->a(LD2/u;I)V

    :cond_0
    return-void
.end method

.method public final b(Li2/c;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v7, p0

    const/4 v0, 0x0

    sget-object v1, LA2/b;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    iget-object v14, v7, LA2/a;->f:LA2/b;

    invoke-virtual {v1, v14}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LA2/j;

    :goto_0
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, LA2/b;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v2, v14}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const/4 v15, 0x1

    invoke-virtual {v14, v2, v3, v15}, LA2/b;->r(JZ)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v0, LA2/d;->l:LD2/w;

    iput-object v0, v7, LA2/a;->d:Ljava/lang/Object;

    invoke-virtual {v14}, LA2/b;->m()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_8

    :cond_0
    sget v1, LD2/v;->a:I

    throw v0

    :cond_1
    sget-object v2, LA2/b;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v2, v14}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v16

    sget v2, LA2/d;->b:I

    int-to-long v2, v2

    div-long v4, v16, v2

    rem-long v2, v16, v2

    long-to-int v6, v2

    iget-wide v2, v1, LD2/u;->f:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_3

    invoke-virtual {v14, v4, v5, v1}, LA2/b;->l(JLA2/j;)LA2/j;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    move-object v4, v2

    goto :goto_1

    :cond_3
    move-object v4, v1

    :goto_1
    const/4 v13, 0x0

    move-object v8, v14

    move-object v9, v4

    move v10, v6

    move-wide/from16 v11, v16

    invoke-virtual/range {v8 .. v13}, LA2/b;->z(LA2/j;IJLA2/a;)Ljava/lang/Object;

    move-result-object v1

    sget-object v8, LA2/d;->m:LD2/w;

    if-eq v1, v8, :cond_13

    sget-object v9, LA2/d;->o:LD2/w;

    if-ne v1, v9, :cond_5

    invoke-virtual {v14}, LA2/b;->o()J

    move-result-wide v1

    cmp-long v1, v16, v1

    if-gez v1, :cond_4

    invoke-virtual {v4}, LD2/c;->a()V

    :cond_4
    move-object v1, v4

    goto :goto_0

    :cond_5
    sget-object v2, LA2/d;->n:LD2/w;

    if-ne v1, v2, :cond_12

    iget-object v10, v7, LA2/a;->f:LA2/b;

    invoke-static/range {p1 .. p1}, LZ/b;->z(Lg2/d;)Lg2/d;

    move-result-object v1

    invoke-static {v1}, Ly2/v;->g(Lg2/d;)Ly2/f;

    move-result-object v11

    :try_start_0
    iput-object v11, v7, LA2/a;->e:Ly2/f;

    move-object v1, v10

    move-object v2, v4

    move v3, v6

    move-object v12, v4

    move-wide/from16 v4, v16

    move v13, v6

    move-object/from16 v6, p0

    invoke-virtual/range {v1 .. v6}, LA2/b;->z(LA2/j;IJLA2/a;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_6

    invoke-virtual {v7, v12, v13}, LA2/a;->a(LD2/u;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_6

    :cond_6
    const/4 v8, 0x0

    iget-object v13, v11, Ly2/f;->h:Lg2/i;

    iget-object v6, v10, LA2/b;->e:Lo2/c;

    if-ne v1, v9, :cond_11

    :try_start_1
    invoke-virtual {v10}, LA2/b;->o()J

    move-result-wide v1

    cmp-long v1, v16, v1

    if-gez v1, :cond_7

    invoke-virtual {v12}, LD2/c;->a()V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_7
    :goto_2
    sget-object v1, LA2/b;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v10}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LA2/j;

    :goto_3
    sget-object v2, LA2/b;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v2, v10}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-virtual {v10, v2, v3, v15}, LA2/b;->r(JZ)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v0, v7, LA2/a;->e:Ly2/f;

    invoke-static {v0}, Lp2/g;->b(Ljava/lang/Object;)V

    iput-object v8, v7, LA2/a;->e:Ly2/f;

    sget-object v1, LA2/d;->l:LD2/w;

    iput-object v1, v7, LA2/a;->d:Ljava/lang/Object;

    invoke-virtual {v14}, LA2/b;->m()Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_8

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ly2/f;->t(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_8
    invoke-static {v1}, LZ0/d;->q(Ljava/lang/Throwable;)Lc2/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly2/f;->t(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_9
    sget-object v2, LA2/b;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v2, v10}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v16

    sget v2, LA2/d;->b:I

    int-to-long v2, v2

    div-long v4, v16, v2

    rem-long v2, v16, v2

    long-to-int v9, v2

    iget-wide v2, v1, LD2/u;->f:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_b

    invoke-virtual {v10, v4, v5, v1}, LA2/b;->l(JLA2/j;)LA2/j;

    move-result-object v2

    if-nez v2, :cond_a

    goto :goto_3

    :cond_a
    move-object v12, v2

    goto :goto_4

    :cond_b
    move-object v12, v1

    :goto_4
    move-object v1, v10

    move-object v2, v12

    move v3, v9

    move-wide/from16 v4, v16

    move-object v15, v6

    move-object/from16 v6, p0

    invoke-virtual/range {v1 .. v6}, LA2/b;->z(LA2/j;IJLA2/a;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LA2/d;->m:LD2/w;

    if-ne v1, v2, :cond_c

    invoke-virtual {v7, v12, v9}, LA2/a;->a(LD2/u;I)V

    goto :goto_6

    :cond_c
    sget-object v2, LA2/d;->o:LD2/w;

    if-ne v1, v2, :cond_e

    invoke-virtual {v10}, LA2/b;->o()J

    move-result-wide v1

    cmp-long v1, v16, v1

    if-gez v1, :cond_d

    invoke-virtual {v12}, LD2/c;->a()V

    :cond_d
    move-object v1, v12

    move-object v6, v15

    const/4 v15, 0x1

    goto :goto_3

    :cond_e
    sget-object v2, LA2/d;->n:LD2/w;

    if-eq v1, v2, :cond_10

    invoke-virtual {v12}, LD2/c;->a()V

    iput-object v1, v7, LA2/a;->d:Ljava/lang/Object;

    iput-object v8, v7, LA2/a;->e:Ly2/f;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    if-eqz v15, :cond_f

    new-instance v8, LD2/p;

    invoke-direct {v8, v15, v1, v13, v0}, LD2/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    :cond_f
    :goto_5
    invoke-virtual {v11, v2, v8}, Ly2/f;->g(Ljava/lang/Object;Lo2/c;)V

    goto :goto_6

    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unexpected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    move-object v15, v6

    invoke-virtual {v12}, LD2/c;->a()V

    iput-object v1, v7, LA2/a;->d:Ljava/lang/Object;

    iput-object v8, v7, LA2/a;->e:Ly2/f;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    if-eqz v15, :cond_f

    new-instance v8, LD2/p;

    invoke-direct {v8, v15, v1, v13, v0}, LD2/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_5

    :goto_6
    invoke-virtual {v11}, Ly2/f;->s()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :goto_7
    invoke-virtual {v11}, Ly2/f;->C()V

    throw v0

    :cond_12
    move-object v12, v4

    invoke-virtual {v12}, LD2/c;->a()V

    iput-object v1, v7, LA2/a;->d:Ljava/lang/Object;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_8
    return-object v0

    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unreachable"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LA2/a;->d:Ljava/lang/Object;

    sget-object v1, LA2/d;->p:LD2/w;

    if-eq v0, v1, :cond_2

    iput-object v1, p0, LA2/a;->d:Ljava/lang/Object;

    sget-object v1, LA2/d;->l:LD2/w;

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LA2/a;->f:LA2/b;

    invoke-virtual {v0}, LA2/b;->m()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, LA2/k;

    const-string v1, "Channel was closed"

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    :cond_1
    sget v1, LD2/v;->a:I

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "`hasNext()` has not been invoked"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
