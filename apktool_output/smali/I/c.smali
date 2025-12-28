.class public LI/c;
.super Ld2/e;
.source "SourceFile"


# static fields
.field public static final f:LI/c;


# instance fields
.field public final d:LI/n;

.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LI/c;

    sget-object v1, LI/n;->e:LI/n;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LI/c;-><init>(LI/n;I)V

    sput-object v0, LI/c;->f:LI/c;

    return-void
.end method

.method public constructor <init>(LI/n;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI/c;->d:LI/n;

    iput p2, p0, LI/c;->e:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;LJ/a;)LI/c;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    iget-object v2, p0, LI/c;->d:LI/n;

    invoke-virtual {v2, v1, p1, p2, v0}, LI/n;->u(ILjava/lang/Object;Ljava/lang/Object;I)LI/m;

    move-result-object p1

    if-nez p1, :cond_1

    return-object p0

    :cond_1
    new-instance p2, LI/c;

    iget-object v0, p1, LI/m;->f:Ljava/lang/Object;

    check-cast v0, LI/n;

    iget v1, p0, LI/c;->e:I

    iget p1, p1, LI/m;->e:I

    add-int/2addr v1, p1

    invoke-direct {p2, v0, v1}, LI/c;-><init>(LI/n;I)V

    return-object p2
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    iget-object v2, p0, LI/c;->d:LI/n;

    invoke-virtual {v2, v1, v0, p1}, LI/n;->d(IILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    iget-object v2, p0, LI/c;->d:LI/n;

    invoke-virtual {v2, v1, v0, p1}, LI/n;->g(IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
