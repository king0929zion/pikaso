.class public final LI/b;
.super LI/a;
.source "SourceFile"


# instance fields
.field public final f:LI/g;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LI/g;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p2, p3}, LI/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, LI/b;->f:LI/g;

    iput-object p3, p0, LI/b;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LI/b;->g:Ljava/lang/Object;

    return-object v0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, LI/b;->g:Ljava/lang/Object;

    iput-object p1, p0, LI/b;->g:Ljava/lang/Object;

    iget-object v1, p0, LI/b;->f:LI/g;

    iget-object v1, v1, LI/g;->e:Ljava/util/Iterator;

    check-cast v1, LI/e;

    iget-object v2, v1, LI/e;->g:LL/d;

    iget-object v3, p0, LI/a;->d:Ljava/lang/Object;

    invoke-virtual {v2, v3}, LL/d;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_2

    :cond_0
    iget-boolean v4, v1, LI/d;->f:Z

    if-eqz v4, :cond_3

    if-eqz v4, :cond_2

    iget-object v4, v1, LI/d;->d:[LI/o;

    iget v5, v1, LI/d;->e:I

    aget-object v4, v4, v5

    iget-object v5, v4, LI/o;->d:[Ljava/lang/Object;

    iget v4, v4, LI/o;->f:I

    aget-object v4, v5, v4

    invoke-virtual {v2, v3, p1}, LL/d;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_1
    move v3, p1

    :goto_0
    iget-object v5, v2, LL/d;->e:LI/n;

    invoke-virtual {v1, v3, v5, v4, p1}, LI/e;->c(ILI/n;Ljava/lang/Object;I)V

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1

    :cond_3
    invoke-virtual {v2, v3, p1}, LL/d;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    iget p1, v2, LL/d;->g:I

    iput p1, v1, LI/e;->j:I

    :goto_2
    return-object v0
.end method
