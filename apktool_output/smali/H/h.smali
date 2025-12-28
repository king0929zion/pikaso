.class public final LH/h;
.super LH/a;
.source "SourceFile"


# instance fields
.field public final f:[Ljava/lang/Object;

.field public final g:LH/k;


# direct methods
.method public constructor <init>([Ljava/lang/Object;[Ljava/lang/Object;III)V
    .locals 0

    invoke-direct {p0, p3, p4}, LH/a;-><init>(II)V

    iput-object p2, p0, LH/h;->f:[Ljava/lang/Object;

    add-int/lit8 p4, p4, -0x1

    and-int/lit8 p2, p4, -0x20

    if-le p3, p2, :cond_0

    move p3, p2

    :cond_0
    new-instance p4, LH/k;

    invoke-direct {p4, p1, p3, p2, p5}, LH/k;-><init>([Ljava/lang/Object;III)V

    iput-object p4, p0, LH/h;->g:LH/k;

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, LH/a;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LH/h;->g:LH/k;

    invoke-virtual {v0}, LH/a;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, LH/a;->d:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, LH/a;->d:I

    invoke-virtual {v0}, LH/k;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    iget v1, p0, LH/a;->d:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LH/a;->d:I

    iget v0, v0, LH/a;->e:I

    sub-int/2addr v1, v0

    iget-object v0, p0, LH/h;->f:[Ljava/lang/Object;

    aget-object v0, v0, v1

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, LH/a;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, LH/a;->d:I

    iget-object v1, p0, LH/h;->g:LH/k;

    iget v2, v1, LH/a;->e:I

    if-le v0, v2, :cond_0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LH/a;->d:I

    sub-int/2addr v0, v2

    iget-object v1, p0, LH/h;->f:[Ljava/lang/Object;

    aget-object v0, v1, v0

    return-object v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LH/a;->d:I

    invoke-virtual {v1}, LH/k;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
