.class public final Lv0/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM/f;


# instance fields
.field public final synthetic d:Lp2/h;

.field public final synthetic e:Lp2/h;


# direct methods
.method public constructor <init>(Lo2/e;Lo2/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Lp2/h;

    iput-object p1, p0, Lv0/t;->d:Lp2/h;

    check-cast p2, Lp2/h;

    iput-object p2, p0, Lv0/t;->e:Lp2/h;

    return-void
.end method


# virtual methods
.method public final c(LM/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv0/t;->d:Lp2/h;

    invoke-interface {v0, p1, p2}, Lo2/e;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
