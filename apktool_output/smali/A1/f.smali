.class public final LA1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    sget-object v0, Ln/D;->a:[J

    .line 8
    new-instance v0, Ln/y;

    invoke-direct {v0}, Ln/y;-><init>()V

    .line 9
    iput-object v0, p0, LA1/f;->b:Ljava/lang/Object;

    .line 10
    new-instance v0, LF/d;

    const/16 v1, 0x10

    new-array v1, v1, [Lo2/a;

    invoke-direct {v0, v1}, LF/d;-><init>([Ljava/lang/Object;)V

    .line 11
    iput-object v0, p0, LA1/f;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LA1/g;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA1/f;->b:Ljava/lang/Object;

    .line 2
    new-instance p1, LA1/e;

    .line 3
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Lm/f;

    invoke-direct {v0}, Lm/f;-><init>()V

    iput-object v0, p1, LA1/e;->c:Ljava/lang/Object;

    .line 5
    iput-object p1, p0, LA1/f;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb/j;Lb/c;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA1/f;->b:Ljava/lang/Object;

    .line 14
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LA1/f;->c:Ljava/lang/Object;

    return-void
.end method

.method public static final a(LA1/f;)V
    .locals 4

    iget-object v0, p0, LA1/f;->b:Ljava/lang/Object;

    check-cast v0, Ln/y;

    invoke-virtual {v0}, Ln/y;->a()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LA1/f;->a:Z

    iget-object p0, p0, LA1/f;->c:Ljava/lang/Object;

    check-cast p0, LF/d;

    iget v1, p0, LF/d;->f:I

    if-lez v1, :cond_1

    iget-object v2, p0, LF/d;->d:[Ljava/lang/Object;

    :cond_0
    aget-object v3, v2, v0

    check-cast v3, Lo2/a;

    invoke-interface {v3}, Lo2/a;->c()Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    if-lt v0, v1, :cond_0

    :cond_1
    invoke-virtual {p0}, LF/d;->g()V

    return-void
.end method

.method public static final b(LA1/f;)V
    .locals 15

    iget-object v0, p0, LA1/f;->b:Ljava/lang/Object;

    check-cast v0, Ln/y;

    iget-object v1, v0, Ln/y;->b:[Ljava/lang/Object;

    iget-object v2, v0, Ln/y;->a:[J

    array-length v3, v2

    add-int/lit8 v3, v3, -0x2

    const/4 v4, 0x0

    if-ltz v3, :cond_4

    move v5, v4

    :goto_0
    aget-wide v6, v2, v5

    not-long v8, v6

    const/4 v10, 0x7

    shl-long/2addr v8, v10

    and-long/2addr v8, v6

    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v8, v10

    cmp-long v8, v8, v10

    if-eqz v8, :cond_3

    sub-int v8, v5, v3

    not-int v8, v8

    ushr-int/lit8 v8, v8, 0x1f

    const/16 v9, 0x8

    rsub-int/lit8 v8, v8, 0x8

    move v10, v4

    :goto_1
    if-ge v10, v8, :cond_2

    const-wide/16 v11, 0xff

    and-long/2addr v11, v6

    const-wide/16 v13, 0x80

    cmp-long v11, v11, v13

    if-gez v11, :cond_1

    shl-int/lit8 v11, v5, 0x3

    add-int/2addr v11, v10

    aget-object v11, v1, v11

    check-cast v11, LU/q;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v11}, LU/c;->E(LU/q;)LA1/f;

    move-result-object v12

    iget-object v12, v12, LA1/f;->b:Ljava/lang/Object;

    check-cast v12, Ln/y;

    invoke-virtual {v12, v11}, Ln/y;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LU/p;

    if-eqz v12, :cond_0

    iput-object v12, v11, LU/q;->s:LU/p;

    goto :goto_2

    :cond_0
    const-string p0, "committing a node that was not updated in the current transaction"

    invoke-static {p0}, LZ0/d;->T(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    :goto_2
    shr-long/2addr v6, v9

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_2
    if-ne v8, v9, :cond_4

    :cond_3
    if-eq v5, v3, :cond_4

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Ln/y;->a()V

    iput-boolean v4, p0, LA1/f;->a:Z

    iget-object p0, p0, LA1/f;->c:Ljava/lang/Object;

    check-cast p0, LF/d;

    invoke-virtual {p0}, LF/d;->g()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 4

    iget-object v0, p0, LA1/f;->b:Ljava/lang/Object;

    invoke-interface {v0}, Landroidx/lifecycle/r;->c()Landroidx/lifecycle/t;

    move-result-object v1

    iget-object v2, v1, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    sget-object v3, Landroidx/lifecycle/m;->e:Landroidx/lifecycle/m;

    if-ne v2, v3, :cond_1

    new-instance v2, LA1/a;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0}, LA1/a;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    iget-object v0, p0, LA1/f;->c:Ljava/lang/Object;

    check-cast v0, LA1/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v2, v0, LA1/e;->a:Z

    if-nez v2, :cond_0

    new-instance v2, LA1/b;

    invoke-direct {v2, v0}, LA1/b;-><init>(LA1/e;)V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    const/4 v1, 0x1

    iput-boolean v1, v0, LA1/e;->a:Z

    iput-boolean v1, p0, LA1/f;->a:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "SavedStateRegistry was already attached."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Restarter must be created only during owner\'s initialization stage"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
