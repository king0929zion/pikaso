.class public final LA2/j;
.super LD2/u;
.source "SourceFile"


# instance fields
.field public final h:LA2/b;

.field public final i:Ljava/util/concurrent/atomic/AtomicReferenceArray;


# direct methods
.method public constructor <init>(JLA2/j;LA2/b;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p5}, LD2/u;-><init>(JLD2/u;I)V

    iput-object p4, p0, LA2/j;->h:LA2/b;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    sget p2, LA2/d;->b:I

    mul-int/lit8 p2, p2, 0x2

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    iput-object p1, p0, LA2/j;->i:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    return-void
.end method


# virtual methods
.method public final f()I
    .locals 1

    sget v0, LA2/d;->b:I

    return v0
.end method

.method public final g(ILg2/i;)V
    .locals 6

    sget v0, LA2/d;->b:I

    if-lt p1, v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    sub-int/2addr p1, v0

    :cond_1
    iget-object v0, p0, LA2/j;->i:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    mul-int/lit8 v2, p1, 0x2

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, LA2/j;->k(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ly2/p0;

    iget-object v4, p0, LA2/j;->h:LA2/b;

    const/4 v5, 0x0

    if-nez v3, :cond_b

    instance-of v3, v2, LA2/r;

    if-eqz v3, :cond_3

    goto :goto_4

    :cond_3
    sget-object v3, LA2/d;->j:LD2/w;

    if-eq v2, v3, :cond_9

    sget-object v3, LA2/d;->k:LD2/w;

    if-ne v2, v3, :cond_4

    goto :goto_3

    :cond_4
    sget-object v3, LA2/d;->g:LD2/w;

    if-eq v2, v3, :cond_2

    sget-object v3, LA2/d;->f:LD2/w;

    if-ne v2, v3, :cond_5

    goto :goto_1

    :cond_5
    sget-object p1, LA2/d;->i:LD2/w;

    if-eq v2, p1, :cond_8

    sget-object p1, LA2/d;->d:LD2/w;

    if-ne v2, p1, :cond_6

    goto :goto_2

    :cond_6
    sget-object p1, LA2/d;->l:LD2/w;

    if-ne v2, p1, :cond_7

    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "unexpected state: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_2
    return-void

    :cond_9
    :goto_3
    invoke-virtual {p0, p1, v5}, LA2/j;->m(ILjava/lang/Object;)V

    if-eqz v1, :cond_a

    invoke-static {v4}, Lp2/g;->b(Ljava/lang/Object;)V

    iget-object p1, v4, LA2/b;->e:Lo2/c;

    if-eqz p1, :cond_a

    invoke-static {p1, v0, v5}, LD2/a;->a(Lo2/c;Ljava/lang/Object;LB1/c;)LB1/c;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-static {p2, p1}, Ly2/v;->h(Lg2/i;Ljava/lang/Throwable;)V

    :cond_a
    return-void

    :cond_b
    :goto_4
    if-eqz v1, :cond_c

    sget-object v3, LA2/d;->j:LD2/w;

    goto :goto_5

    :cond_c
    sget-object v3, LA2/d;->k:LD2/w;

    :goto_5
    invoke-virtual {p0, v2, p1, v3}, LA2/j;->j(Ljava/lang/Object;ILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, p1, v5}, LA2/j;->m(ILjava/lang/Object;)V

    xor-int/lit8 v2, v1, 0x1

    invoke-virtual {p0, p1, v2}, LA2/j;->l(IZ)V

    if-eqz v1, :cond_d

    invoke-static {v4}, Lp2/g;->b(Ljava/lang/Object;)V

    iget-object p1, v4, LA2/b;->e:Lo2/c;

    if-eqz p1, :cond_d

    invoke-static {p1, v0, v5}, LD2/a;->a(Lo2/c;Ljava/lang/Object;LB1/c;)LB1/c;

    move-result-object p1

    if-eqz p1, :cond_d

    invoke-static {p2, p1}, Ly2/v;->h(Lg2/i;Ljava/lang/Throwable;)V

    :cond_d
    return-void
.end method

.method public final j(Ljava/lang/Object;ILjava/lang/Object;)Z
    .locals 3

    iget-object v0, p0, LA2/j;->i:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    mul-int/lit8 p2, p2, 0x2

    const/4 v1, 0x1

    add-int/2addr p2, v1

    :cond_0
    invoke-virtual {v0, p2, p1, p3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_0

    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final k(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LA2/j;->i:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(IZ)V
    .locals 19

    move-object/from16 v0, p0

    if-eqz p2, :cond_7

    iget-object v7, v0, LA2/j;->h:LA2/b;

    invoke-static {v7}, Lp2/g;->b(Ljava/lang/Object;)V

    sget v1, LA2/d;->b:I

    int-to-long v1, v1

    iget-wide v3, v0, LD2/u;->f:J

    mul-long/2addr v3, v1

    move/from16 v1, p1

    int-to-long v1, v1

    add-long/2addr v3, v1

    invoke-virtual {v7}, LA2/b;->t()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    sget-object v8, LA2/b;->h:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v8, v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v1

    cmp-long v1, v1, v3

    if-lez v1, :cond_0

    sget v1, LA2/d;->c:I

    const/4 v9, 0x0

    move v2, v9

    :goto_0
    sget-object v10, LA2/b;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-wide v11, 0x3fffffffffffffffL    # 1.9999999999999998

    if-ge v2, v1, :cond_2

    invoke-virtual {v8, v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    invoke-virtual {v10, v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v5

    and-long/2addr v5, v11

    cmp-long v5, v3, v5

    if-nez v5, :cond_1

    invoke-virtual {v8, v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-nez v3, :cond_1

    goto :goto_3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v10, v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    and-long v1, v3, v11

    const-wide/high16 v13, 0x4000000000000000L    # 2.0

    add-long v5, v13, v1

    move-object v1, v10

    move-object v2, v7

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_3
    :goto_1
    invoke-virtual {v8, v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v1

    sget-object v10, LA2/b;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v10, v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    and-long v5, v3, v11

    and-long v15, v3, v13

    const-wide/16 v17, 0x0

    cmp-long v15, v15, v17

    if-eqz v15, :cond_4

    const/4 v15, 0x1

    goto :goto_2

    :cond_4
    move v15, v9

    :goto_2
    cmp-long v16, v1, v5

    if-nez v16, :cond_6

    invoke-virtual {v8, v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v16

    cmp-long v1, v1, v16

    if-nez v1, :cond_6

    :cond_5
    invoke-virtual {v10, v7}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    and-long v5, v3, v11

    move-object v1, v10

    move-object v2, v7

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_3

    :cond_6
    if-nez v15, :cond_3

    add-long/2addr v5, v13

    move-object v1, v10

    move-object v2, v7

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    goto :goto_1

    :cond_7
    :goto_3
    invoke-virtual/range {p0 .. p0}, LD2/u;->h()V

    return-void
.end method

.method public final m(ILjava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LA2/j;->i:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    mul-int/lit8 p1, p1, 0x2

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->lazySet(ILjava/lang/Object;)V

    return-void
.end method

.method public final n(ILD2/w;)V
    .locals 1

    iget-object v0, p0, LA2/j;->i:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    mul-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    return-void
.end method
