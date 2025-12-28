.class public LL0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:[Ljava/lang/Object;

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LL0/f;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    .line 5
    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, LL0/f;->b:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LL0/f;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lez p1, :cond_0

    .line 2
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, LL0/f;->b:[Ljava/lang/Object;

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The max pool size must be > 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 5

    iget v0, p0, LL0/f;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, LL0/f;->c:I

    const/4 v1, 0x0

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    iget-object v2, p0, LL0/f;->b:[Ljava/lang/Object;

    aget-object v3, v2, v0

    const-string v4, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool"

    invoke-static {v3, v4}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v1, v2, v0

    iget v0, p0, LL0/f;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LL0/f;->c:I

    move-object v1, v3

    :cond_0
    return-object v1

    :pswitch_0
    iget v0, p0, LL0/f;->c:I

    const/4 v1, 0x0

    if-lez v0, :cond_1

    add-int/lit8 v2, v0, -0x1

    iget-object v3, p0, LL0/f;->b:[Ljava/lang/Object;

    aget-object v4, v3, v2

    aput-object v1, v3, v2

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LL0/f;->c:I

    move-object v1, v4

    :cond_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(LL0/c;)V
    .locals 3

    iget v0, p0, LL0/f;->c:I

    iget-object v1, p0, LL0/f;->b:[Ljava/lang/Object;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aput-object p1, v1, v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LL0/f;->c:I

    :cond_0
    return-void
.end method

.method public c(Ljava/lang/Object;)Z
    .locals 6

    const-string v0, "instance"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, LL0/f;->c:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, LL0/f;->b:[Ljava/lang/Object;

    const/4 v4, 0x1

    if-ge v2, v0, :cond_1

    aget-object v5, v3, v2

    if-ne v5, p1, :cond_0

    move v0, v4

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_1
    if-nez v0, :cond_3

    iget v0, p0, LL0/f;->c:I

    array-length v2, v3

    if-ge v0, v2, :cond_2

    aput-object p1, v3, v0

    add-int/2addr v0, v4

    iput v0, p0, LL0/f;->c:I

    return v4

    :cond_2
    return v1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already in the pool!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
