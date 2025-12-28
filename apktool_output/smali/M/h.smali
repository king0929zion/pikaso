.class public final LM/h;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/c;


# static fields
.field public static final e:LM/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LM/h;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lp2/h;-><init>(I)V

    sput-object v0, LM/h;->e:LM/h;

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method
