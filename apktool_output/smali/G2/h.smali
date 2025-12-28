.class public LG2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile _availablePermits:I

.field public final a:LD/y;

.field private volatile deqIdx:J

.field private volatile enqIdx:J

.field private volatile head:Ljava/lang/Object;

.field private volatile tail:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "head"

    const-class v1, LG2/h;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LG2/h;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "deqIdx"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LG2/h;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "tail"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LG2/h;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "enqIdx"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LG2/h;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    const-string v0, "_availablePermits"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LG2/h;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    if-gt p1, v0, :cond_0

    new-instance v1, LG2/j;

    const/4 v2, 0x2

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-direct {v1, v3, v4, v5, v2}, LG2/j;-><init>(JLG2/j;I)V

    iput-object v1, p0, LG2/h;->head:Ljava/lang/Object;

    iput-object v1, p0, LG2/h;->tail:Ljava/lang/Object;

    sub-int/2addr v0, p1

    iput v0, p0, LG2/h;->_availablePermits:I

    new-instance p1, LD/y;

    const/4 v0, 0x3

    invoke-direct {p1, v0, p0}, LD/y;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, LG2/h;->a:LD/y;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The number of acquired permits should be in 0..1"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(LG2/c;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    :cond_0
    :goto_0
    sget-object v2, LG2/h;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, 0x1

    if-gt v2, v3, :cond_0

    sget-object v3, Lc2/m;->a:Lc2/m;

    iget-object v4, v0, LG2/h;->a:LD/y;

    if-lez v2, :cond_1

    invoke-virtual {v1, v3, v4}, LG2/c;->g(Ljava/lang/Object;Lo2/c;)V

    goto/16 :goto_4

    :cond_1
    sget-object v2, LG2/h;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LG2/j;

    sget-object v6, LG2/h;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v6, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v6

    sget-object v8, LG2/f;->l:LG2/f;

    sget v9, LG2/i;->f:I

    int-to-long v9, v9

    div-long v9, v6, v9

    :goto_1
    invoke-static {v5, v9, v10, v8}, LD2/a;->b(LD2/u;JLo2/e;)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11}, LD2/a;->e(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_6

    invoke-static {v11}, LD2/a;->c(Ljava/lang/Object;)LD2/u;

    move-result-object v12

    :goto_2
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LD2/u;

    iget-wide v14, v13, LD2/u;->f:J

    move-object/from16 v16, v8

    move-wide/from16 v17, v9

    iget-wide v8, v12, LD2/u;->f:J

    cmp-long v8, v14, v8

    if-ltz v8, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v12}, LD2/u;->i()Z

    move-result v8

    if-nez v8, :cond_3

    move-object/from16 v8, v16

    move-wide/from16 v9, v17

    goto :goto_1

    :cond_3
    invoke-virtual {v2, v0, v13, v12}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-virtual {v13}, LD2/u;->e()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v13}, LD2/c;->d()V

    goto :goto_3

    :cond_4
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-eq v8, v13, :cond_3

    invoke-virtual {v12}, LD2/u;->e()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-virtual {v12}, LD2/c;->d()V

    :cond_5
    move-object/from16 v8, v16

    move-wide/from16 v9, v17

    goto :goto_2

    :cond_6
    :goto_3
    invoke-static {v11}, LD2/a;->c(Ljava/lang/Object;)LD2/u;

    move-result-object v2

    check-cast v2, LG2/j;

    sget v5, LG2/i;->f:I

    int-to-long v8, v5

    rem-long/2addr v6, v8

    long-to-int v5, v6

    iget-object v6, v2, LG2/j;->h:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    :cond_7
    const/4 v7, 0x0

    invoke-virtual {v6, v5, v7, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v1, v2, v5}, Ly2/p0;->a(LD2/u;I)V

    goto :goto_4

    :cond_8
    invoke-virtual {v6, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_7

    sget-object v7, LG2/i;->b:LD2/w;

    sget-object v8, LG2/i;->c:LD2/w;

    :cond_9
    invoke-virtual {v6, v5, v7, v8}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v1, v3, v4}, Ly2/e;->g(Ljava/lang/Object;Lo2/c;)V

    :goto_4
    return-void

    :cond_a
    invoke-virtual {v6, v5}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v7, :cond_9

    goto/16 :goto_0
.end method

.method public final b()V
    .locals 15

    :cond_0
    sget-object v0, LG2/h;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndIncrement(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x1

    if-ge v1, v2, :cond_10

    if-ltz v1, :cond_1

    return-void

    :cond_1
    sget-object v0, LG2/h;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LG2/j;

    sget-object v3, LG2/h;->c:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v3

    sget v5, LG2/i;->f:I

    int-to-long v5, v5

    div-long v5, v3, v5

    sget-object v7, LG2/g;->l:LG2/g;

    :goto_0
    invoke-static {v1, v5, v6, v7}, LD2/a;->b(LD2/u;JLo2/e;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, LD2/a;->e(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    invoke-static {v8}, LD2/a;->c(Ljava/lang/Object;)LD2/u;

    move-result-object v9

    :cond_2
    :goto_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LD2/u;

    iget-wide v11, v10, LD2/u;->f:J

    iget-wide v13, v9, LD2/u;->f:J

    cmp-long v11, v11, v13

    if-ltz v11, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v9}, LD2/u;->i()Z

    move-result v11

    if-nez v11, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {v0, p0, v10, v9}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-virtual {v10}, LD2/u;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v10}, LD2/c;->d()V

    goto :goto_2

    :cond_5
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-eq v11, v10, :cond_4

    invoke-virtual {v9}, LD2/u;->e()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v9}, LD2/c;->d()V

    goto :goto_1

    :cond_6
    :goto_2
    invoke-static {v8}, LD2/a;->c(Ljava/lang/Object;)LD2/u;

    move-result-object v0

    check-cast v0, LG2/j;

    invoke-virtual {v0}, LD2/c;->a()V

    iget-wide v7, v0, LD2/u;->f:J

    cmp-long v1, v7, v5

    const/4 v5, 0x0

    if-lez v1, :cond_8

    :cond_7
    :goto_3
    move v2, v5

    goto :goto_6

    :cond_8
    sget v1, LG2/i;->f:I

    int-to-long v6, v1

    rem-long/2addr v3, v6

    long-to-int v1, v3

    sget-object v3, LG2/i;->b:LD2/w;

    iget-object v0, v0, LG2/j;->h:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v0, v1, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->getAndSet(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_d

    sget v3, LG2/i;->a:I

    move v4, v5

    :goto_4
    if-ge v4, v3, :cond_a

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    sget-object v7, LG2/i;->c:LD2/w;

    if-ne v6, v7, :cond_9

    goto :goto_6

    :cond_9
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_a
    sget-object v4, LG2/i;->b:LD2/w;

    sget-object v6, LG2/i;->d:LD2/w;

    :cond_b
    invoke-virtual {v0, v1, v4, v6}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->compareAndSet(ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    move v5, v2

    goto :goto_5

    :cond_c
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v4, :cond_b

    :goto_5
    xor-int/2addr v2, v5

    goto :goto_6

    :cond_d
    sget-object v0, LG2/i;->e:LD2/w;

    if-ne v3, v0, :cond_e

    goto :goto_3

    :cond_e
    instance-of v0, v3, Ly2/e;

    if-eqz v0, :cond_f

    check-cast v3, Ly2/e;

    sget-object v0, Lc2/m;->a:Lc2/m;

    iget-object v1, p0, LG2/h;->a:LD/y;

    invoke-interface {v3, v0, v1}, Ly2/e;->d(Ljava/lang/Object;Lo2/c;)LD2/w;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {v3, v0}, Ly2/e;->w(Ljava/lang/Object;)V

    :goto_6
    if-eqz v2, :cond_0

    return-void

    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unexpected: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    :goto_7
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v1

    if-le v1, v2, :cond_11

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-nez v1, :cond_11

    goto :goto_7

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The number of released permits cannot be greater than 1"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
