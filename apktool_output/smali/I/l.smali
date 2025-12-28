.class public final LI/l;
.super Ld2/a;
.source "SourceFile"


# instance fields
.field public final d:LI/c;


# direct methods
.method public constructor <init>(LI/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI/l;->d:LI/c;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, LI/l;->d:LI/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, v0, LI/c;->e:I

    return v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LI/l;->d:LI/c;

    invoke-virtual {v0, p1}, Ld2/e;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 7

    new-instance v0, LI/k;

    iget-object v1, p0, LI/l;->d:LI/c;

    iget-object v1, v1, LI/c;->d:LI/n;

    const/16 v2, 0x8

    new-array v3, v2, [LI/o;

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    new-instance v5, LI/p;

    const/4 v6, 0x2

    invoke-direct {v5, v6}, LI/p;-><init>(I)V

    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {v0, v1, v3}, LI/d;-><init>(LI/n;[LI/o;)V

    return-object v0
.end method
